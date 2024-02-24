package coding.io.rentACar.dataAccess.concretes;

import coding.io.rentACar.dataAccess.abstracts.BrandRepository;
import coding.io.rentACar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {
    List <Brand> brands;

    public InMemoryBrandRepository() {
        brands= new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Renault"));

    }

    @Override
    public List<Brand> getAll() {
        return null;
    }
}