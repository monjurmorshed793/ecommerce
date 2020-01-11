package org.iums.ecommerce.repositories;

import org.iums.ecommerce.models.BoughtProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoughtProductRepository extends JpaRepository<BoughtProduct, Long> {

}
