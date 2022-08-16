package com.example.demo.servicio;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.ConexionBD;
import com.example.demo.dao.ISocioDao;
import com.example.demo.domain.Socio;
import java.sql.*;
import java.util.*;

@Service
public class SocioServiceImpl implements SocioService{
    
    @Autowired
    private ISocioDao socioDao;
    private Connection conexion;
    @Override
    @Transactional(readOnly = true)
    public List<Socio> listarSocios(){
        return (List<Socio>)socioDao.findAll();
    }


    @Override
    @Transactional
    public void guardar(Socio socio){
        conexion = ConexionBD.connectDatabase();
        PreparedStatement ps = null;
        String sql = "INSERT INTO socio (curp,nombre,fecha_nacimiento,telefono,correo,direccion,estatus) VALUES(?,?,?,?,?,?,?);";

        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, socio.getCurp());
            ps.setString(2, socio.getNombre());
            ps.setDate(3, socio.getFecha_nacimiento());
            ps.setString(4, socio.getTelefono());
            ps.setString(5, socio.getCorreo());
            ps.setString(6, socio.getDireccion());
            ps.setObject(7, socio.getEstatus(), Types.OTHER);
            ps.executeQuery();

        } catch (Exception e) {
            System.err.println(e);

        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                // System.err.println(e);
            }
        }
    }

    @Override
    @Transactional
    public void eliminar(Socio socio){
        socioDao.delete(socio);
    }

    @Override
    @Transactional(readOnly = true)
    public Socio buscarSocio(Socio socio){
        
        return socioDao.findById(socio.getCurp()).orElse(null);
    }

}
