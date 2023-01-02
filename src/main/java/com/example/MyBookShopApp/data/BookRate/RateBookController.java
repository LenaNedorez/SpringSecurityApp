package com.example.MyBookShopApp.data.BookRate;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class RateBookController {

    private BookRateService bookRateService;

    public RateBookController(BookRateService bookRateService) {
        this.bookRateService = bookRateService;
    }

    @PostMapping("/api/rateBook/{bookId}")
    @ApiOperation("post rate of a book")
    public ResponseEntity<BookRateDto> rateBook(@PathVariable("bookId") Book bookId, @RequestParam User userId, @RequestParam Byte value) {
        return ResponseEntity.ok(bookRateService.postBookRate(new BookRateDto(bookId, userId, value)));
    }

}
