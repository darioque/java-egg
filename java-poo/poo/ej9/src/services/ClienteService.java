package services;

import java.util.ArrayList;

import entities.Cliente;

public class ClienteService {

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente crearCliente(int id, String nombre, int edad, int altura, int peso, String objetivo) {
        Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
        return cliente;
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }

    public void actualizarCliente(int id, String nombre, int edad, int altura, int peso, String objetivo) {
        Cliente cliente = (Cliente) clientes.get(id);
        cliente.setNombre(nombre);
        cliente.setEdad(edad);
        cliente.setAltura(altura);
        cliente.setPeso(peso);
        cliente.setObjetivo(objetivo);
    }

    public void eliminarCliente(int id) {
        clientes.remove(id);
    }

    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
