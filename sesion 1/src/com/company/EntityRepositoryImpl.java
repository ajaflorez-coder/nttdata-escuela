package com.company;

public class EntityRepositoryImpl implements EntityRepository{
    @Override
    public void Connect(String url, String user, String password) throws Exception {
        System.out.println("Connect DB");
    }

    @Override
    public void select(String sql) throws Exception {
        System.out.println("Execute select");
    }

    @Override
    public void insert(String sql) throws Exception {
        System.out.println("Execute insert");
    }
}
