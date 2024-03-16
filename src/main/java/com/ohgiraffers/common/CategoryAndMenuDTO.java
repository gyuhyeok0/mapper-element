package com.ohgiraffers.common;

import java.util.List;

public class CategoryAndMenuDTO {

    private int code;
    private String name;
    private Integer refCategoryCode;

    //1 개의 카테고리는 여러개의 메뉴를 갖고있다.
    private List<MenuDTO> menuList;

//    private MenuDTO menuDTO;           // menuDTo 전체적인 클래스 불러오는

    public CategoryAndMenuDTO() {
    }

    public CategoryAndMenuDTO(int code, String name, Integer refCategoryCode, List<MenuDTO> menuList) {
        this.code = code;
        this.name = name;
        this.refCategoryCode = refCategoryCode;
        this.menuList = menuList;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(Integer refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    public List<MenuDTO> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuDTO> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "CategoryAndMenuDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                ", menuList=" + menuList +
                '}';
    }
}
