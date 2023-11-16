/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos.impl;

import database.Conexion;
import datos.PropiedadDao;
import dominio.Propiedad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author angel
 */
public class PropiedadDaoImpl implements PropiedadDao<Propiedad>{
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public PropiedadDaoImpl() {
        this.CON = Conexion.getInstancia();
    }
    public List<Propiedad> Listar(String texto) {
        List<Propiedad> registros = new ArrayList();

        try {
            ps = CON.conectar().prepareStatement("SELECT * FROM propiedades where nombre like ?");
            ps.setString(1, "%" + texto + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Propiedad(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6), rs.getString(7), rs.getString(8)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return registros;
    }
    @Override
    public boolean insertar(Propiedad obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO propiedades (nombre, direccion, caracteristicas, estado, precioalquiler) VALUES (?,?,?,?,?)");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getDireccion());
            ps.setString(3, obj.getCaracteristicas());
            ps.setString(4, obj.getEstado());
            ps.setDouble(5, obj.getPrecioAlquiler());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;

    }

    @Override
    public boolean actualizar(Propiedad obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE propiedades SET nombre=?,direccion=?, caracteristicas=?, estado=?, precioalquiler=? WHERE id=?");
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getDireccion());
            ps.setString(3, obj.getCaracteristicas());
            ps.setString(4, obj.getEstado());
            ps.setDouble(5, obj.getPrecioAlquiler());
            ps.setInt(6, obj.getId());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean eliminar(Propiedad obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("DELETE FROM propiedades WHERE id=?");
            ps.setInt(1, obj.getId());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;

    }
}
