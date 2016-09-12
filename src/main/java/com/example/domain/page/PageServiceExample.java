package com.example.domain.page;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Service for pages
 * Created by Jakub Tucek on 12.09.2016.
 */
@Service
public class PageServiceExample implements PageService {
    private List<Page> pages;

    public PageServiceExample() {
        pages = Arrays.asList(
                new Page("Registration example", "/pages/registration/registration-properties"),
                new Page("Account example finder", "/pages/account/account-finder"),
                new Page("Account example create", "/pages/account/account-create"),
                new Page("Account example show", "/pages/account/account-show")
        );
    }

    @Override
    public void savePage(Page page) {
        pages.add(page);
    }

    @Override
    public List<Page> findAll() {
        return pages;
    }
}

