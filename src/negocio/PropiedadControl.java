/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import javax.swing.table.DefaultTableModel;
import datos.PropiedadDao;
import datos.impl.PropiedadDaoImpl;
import dominio.Propiedad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public class PropiedadControl {
    private final PropiedadDao DATOS;
    private Propiedad obj;
    private DefaultTableModel modeloTabla;
    
    public PropiedadControl() {
        this.DATOS = new PropiedadDaoImpl();
        this.obj = new Propiedad();
    }
    
    public DefaultTableModel listar(String texto) {
        List<Propiedad> lista = new ArrayList();
        lista.addAll(DATOS.Listar(texto));
        String[] titulos = {"ID","NOMBRE","DIRECCION","CARACTERISTICAS","ESTADO","PRECIO A.","CREADO EL","ACTUALIZADO EL"};
        String[] registro = new String[8];
        this.modeloTabla = new DefaultTableModel(null, titulos);
        
        for(Propiedad item:lista){
            registro[0]=Integer.toString(item.getId());
            registro[1]=item.getNombre();
            registro[2]=item.getDireccion();
            registro[3]=item.getCaracteristicas();
            registro[4]=item.getEstado();
            registro[5]=Double.toString(item.getPrecioAlquiler());
            registro[6]=item.getCreatedAt();
            registro[7]=item.getUpdatedAt();
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }
    public String insertar(Propiedad obj) {
        if (DATOS.insertar(obj)) {
            return "OK";
        } else {
            return "Error en el ingreso de datos";
        }
    }

    public String actualizar(Propiedad obj) {

        if (DATOS.actualizar(obj)) {
            return "OK";
        } else {
            return "Error al actualizar datos";
        }
    }

    public String eliminar(int id) {
        obj.setId(id);
        if (DATOS.eliminar(obj)) {
            return "OK";
        } else {
            return "Error al eliminar datos";
        }
    }
}
