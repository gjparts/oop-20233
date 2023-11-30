using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace crud_20233
{
    public partial class Productos : Form
    {
        public Productos()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //hacer una prueba de conexion a la base de datos
            try
            {
                //crear un objeto de conexion de .Net
                SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                //abrir y cerrar una conexion
                con.Open();
                con.Close();
                //si llego hasta aqui entonces todo salio bien
                MessageBox.Show("Conexion exitosa.");
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error: "+ex.Message);
            }
        }
    }
}
