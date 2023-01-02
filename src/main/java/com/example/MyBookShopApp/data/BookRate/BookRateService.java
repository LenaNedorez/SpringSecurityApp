package com.example.MyBookShopApp.data.BookRate;

import com.example.MyBookShopApp.data.BookRate.BookRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookRateService {

    private BookRateDtoMapping bookRateDtoMapping;

    private BookRateRepository bookRateRepository;

    @Autowired
    public BookRateService(BookRateDtoMapping bookRateDtoMapping, BookRateRepository bookRateRepository) {
        this.bookRateDtoMapping = bookRateDtoMapping;
        this.bookRateRepository = bookRateRepository;
    }

    public BookRateDto postBookRate(BookRateDto bookRateDto){
        return bookRateDtoMapping.mapToBookRateDto(bookRateRepository.save(bookRateDtoMapping.mapToBookRate(bookRateDto)));
    }

    public List<BookRateDto> getAllRates() {
        return bookRateRepository.findAll()
                .stream()
                .map(BookRateDtoMapping::mapToBookRateDto)
                .collect(Collectors.toList());
    }

    public Integer getRating(){
        return Math.round(bookRateRepository.sumOfBookRates() / bookRateRepository.count());
    }
}

