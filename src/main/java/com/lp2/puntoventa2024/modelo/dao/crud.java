/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.lp2.puntoventa2024.modelo.dao;

import java.util.List;

public interface crud<T> {
    public void insertar(T obj);
    public void actualizar(T obj);
    public void eliminar(T obj);
    public List<T> listar();
}
