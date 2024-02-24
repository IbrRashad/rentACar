package coding.io.rentACar.dataAccess.abstracts;

import coding.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository {
    List<Brand> getAll();
}
