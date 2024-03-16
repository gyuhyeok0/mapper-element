package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryAndMenuDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {
    private ElementTestMapper mapper;
    public void selectCacheTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        for (int i =0; i < 10; i++){
            // 필기 조회 시간 확인용 시작 시간
            Long startTime = System.currentTimeMillis();

            List<String> menuList = mapper.selectCacheTest();
            System.out.println(menuList);
            // 필기 조회 시간 확인 용 끝나는 시간
            Long endTime = System.currentTimeMillis();

            Long interval = endTime - startTime;
            System.out.println("수행 시간 : " + interval + "(ms)");
        }
        sqlSession.close();
    }

    public void selectResultMapTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapTest();
        for (MenuDTO menu : menuList){
            System.out.println(menu);
        }
        sqlSession.close();
    }

    public void selectResultMapConstructorTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapConstructorTest();
        for (MenuDTO menu : menuList){
            System.out.println(menu);
        }
        sqlSession.close();
    }

    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();

        for (MenuAndCategoryDTO menu : menuList) {
            System.out.println(menu);
        }
        sqlSession.close();
    }

    public void selectResultMapCollectionTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<CategoryAndMenuDTO> categoryList = mapper.selectResultMapCollectionTest();
        for (CategoryAndMenuDTO cateogry : categoryList) {
            System.out.println(cateogry);
        }

        sqlSession.close();

        
    }

    public void selectSqlTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectSqlTest();   //

        for (MenuDTO menu : menuList){
            System.out.println(menu);
        }

        sqlSession.close();
        
    }
}
