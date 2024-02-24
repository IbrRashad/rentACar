package coding.io.rentACar.business.abstracts;

import coding.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandService {
    List<Brand> getAll();


}
