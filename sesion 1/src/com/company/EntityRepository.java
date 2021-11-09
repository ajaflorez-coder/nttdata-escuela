package com.company;

public interface EntityRepository {
    void Connect(String url, String user, String password) throws Exception;
    void select(String sql) throws Exception;
    void insert(String sql) throws Exception;
}
