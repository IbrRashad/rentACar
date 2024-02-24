package coding.io.rentACar.dataAccess.abstracts;

import coding.io.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
