package com.depanneur_ste_helene.inventory_system.businesslayer;

import com.depanneur_ste_helene.inventory_system.datalayer.Supplier;
import com.depanneur_ste_helene.inventory_system.datalayer.SupplierDTO;
import com.depanneur_ste_helene.inventory_system.datalayer.SupplierRepository;
import com.depanneur_ste_helene.inventory_system.exceptions.InvalidInputException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{
    private final SupplierRepository supplierRespository;
    private final SupplierMapper supplierMapper;

    public SupplierServiceImpl(SupplierRepository supplierRepository, SupplierMapper supplierMapper) {
        this.supplierRespository = supplierRepository;
        this.supplierMapper = supplierMapper;
    }

    @Override
    public List<SupplierDTO> getAllSuppliers() {
       List<Supplier> suppliers = supplierRespository.findAll();
       List<SupplierDTO> models = supplierMapper.entityListToModelList(suppliers);
       return models;
    }

    @Override
    public SupplierDTO createSupplier(SupplierDTO model) {
        if(model.getSupplierName().isBlank() ||
                model.getRepresentativeName().isBlank() ||
                model.getEmail().isBlank() ||
                model.getPhoneNumber().isBlank()){
            throw new InvalidInputException("Input not valid: one field is blank");
        }

        Supplier supplierEntity = supplierMapper.modelToEntity(model);
        Supplier newEntity = supplierRespository.save(supplierEntity);

        return supplierMapper.entityToModel(newEntity);
    }
}
