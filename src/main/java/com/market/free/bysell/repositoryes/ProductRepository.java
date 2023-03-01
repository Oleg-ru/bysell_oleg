package com.market.free.bysell.repositoryes;

import com.market.free.bysell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Ссылка, где это рассказывается
//https://youtu.be/aCyvybo8ko8?list=PLMN3dELi3-VdVo8NGOYqaOLC2alq6ZmSh&t=448
//Нужно для взаимодействия с БД. Логика где прописная уже как удалить, получить или добавить в БД
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title); //Вернет весь список товаров который имеет данный заголовок title
}
