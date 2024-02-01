package by.teachmeskills.shopik.repository;

import by.teachmeskills.shopik.entity.User;

import java.util.Collection;

public interface ShopRepository {
    public void add(User user);
    public void  deleteByld(long userId);
    public Collection<User> allUsers();
}
