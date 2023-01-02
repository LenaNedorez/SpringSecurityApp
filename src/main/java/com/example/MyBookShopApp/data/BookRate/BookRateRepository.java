package com.example.MyBookShopApp.data.BookRate;

import com.example.MyBookShopApp.data.BookRate.BookRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRateRepository extends JpaRepository<BookRate, Integer> {

    @Query("SELECT SUM(bookRate.rate) FROM BookRate bookRate")
    Float sumOfBookRates();

    BookRate save(BookRate bookRate);
}

