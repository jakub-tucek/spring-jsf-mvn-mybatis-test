package com.example.domain.page;

import java.util.List;

/**
 * Page service interface
 * Created by Jakub Tucek on 12.09.2016.
 */
public interface PageService {
    void savePage(Page page);

    List<Page> findAll();

}

