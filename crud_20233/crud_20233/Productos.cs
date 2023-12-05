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
        //atributos
        public DataTable tabla1;

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

        private void Productos_Load(object sender, EventArgs e)
        {
            this.cargarDatos();

            //personalizar el grid
            //ocultar el selector de filas
            grid1.RowHeadersVisible = false;
            //evitar que se pueda eliminar  yagregar filas directamente en el GRID
            grid1.ReadOnly = true;
            grid1.AllowUserToAddRows = false;
            grid1.AllowUserToDeleteRows = false;
            //evitar cambiar altura de filas
            grid1.AllowUserToResizeRows = false;
            //evitar cambiar ancho de columnas
            grid1.AllowUserToResizeColumns = false;
            //evitar poder ordenar las columnas
            //se hace por columna:
            grid1.Columns["Comentarios"].SortMode = DataGridViewColumnSortMode.NotSortable;

            //personalizar los titulos de las columnas
            grid1.Columns["ProductoID"].HeaderText = "ID Único";
            grid1.Columns["PrecioVenta"].HeaderText = "Precio de Venta";
            grid1.Columns["Comentarios"].HeaderText = "Comentarios adicionales";

            //alineadicon del texto de una columna
            grid1.Columns["Costo"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;
            grid1.Columns["PrecioVenta"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;
            grid1.Columns["Existencia"].DefaultCellStyle.Alignment = DataGridViewContentAlignment.MiddleRight;
            //establecer el numero de decimales a mostrar por columna
            grid1.Columns["Costo"].DefaultCellStyle.Format = "0.00";
            grid1.Columns["PrecioVenta"].DefaultCellStyle.Format = "0.00";
            grid1.Columns["Existencia"].DefaultCellStyle.Format = "0.00";

            //disparar el cambio de ancho de columnas
            Productos_SizeChanged(sender, e);
        }

        //metodos
        public void cargarDatos()
        {
            try
            {
                //instanciar el DataTable
                this.tabla1 = new DataTable();

                //crear el objeto de conexion
                SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                //redactar la consulta a la base de datos
                String sql = "SELECT ProductoID, Nombre, Codigo, Costo, PrecioVenta, Existencia, Comentarios FROM Producto";
                //crear el adaptador de datos
                SqlDataAdapter da = new SqlDataAdapter(sql, con);
                //llenar el DataTable tabla1 con el resultado
                //de la consulta sql
                da.Fill(this.tabla1);
                //colocar el DataTable como origen de datos del Grid
                grid1.DataSource = this.tabla1;
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void Productos_SizeChanged(object sender, EventArgs e)
        {
            //cuando se le cambia el tamaño a la ventana
            try
            {
                //pone ancho a las columnas
                //anchos fijos
                grid1.Columns["ProductoID"].Width = 60;
                grid1.Columns["Codigo"].Width = 60;
                grid1.Columns["Costo"].Width = 60;
                grid1.Columns["PrecioVenta"].Width = 60;
                grid1.Columns["Existencia"].Width = 60;
                //anchos dinamicos de acuerdo al tamaño de la ventana 20%
                grid1.Columns["Nombre"].Width = grid1.Width * 20 / 100;
                grid1.Columns["Comentarios"].Width = grid1.Width * 50 / 100; //50%
            }
            catch (Exception ex)
            {

            }
        }

        private void btnAgregar_Click(object sender, EventArgs e)
        {
            //mostrar el form de Detalle
            Detalle d = new Detalle(); //instanciar nuevo objeto
            d.ShowDialog(); //mostrar de forma Modal (encima del que lo mando a llamar)

            //si d no ha sido destruido o sea no esta en estado Disposed
            //es porque si hizo click en Aceptar.
            if( d.IsDisposed == false)
            {
                //insertar el registro en la BD
                String sql = "INSERT Producto(Codigo,Nombre,Costo,PrecioVenta,Existencia, Comentarios)"+
                    " VALUES(@1,@2,@3,@4,@5,@6)";
                //crear objeto de conexion
                SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                //crear objeto para ejecutar instruccion de sql
                SqlCommand cmd = new SqlCommand(sql, con);
                //llenar los parametros del sql con lo que esta en las cajas de texto de Detalle
                cmd.Parameters.AddWithValue("@1", d.codigo.Text);
                cmd.Parameters.AddWithValue("@2", d.nombre.Text);
                cmd.Parameters.AddWithValue("@3", d.costo.Text);
                cmd.Parameters.AddWithValue("@4", d.precioVenta.Text);
                cmd.Parameters.AddWithValue("@5", d.existencias.Text);
                cmd.Parameters.AddWithValue("@6", d.comentarios.Text);
                //ejecutar el comando sql
                try
                {
                    con.Open(); //abrir conexion a a la BD
                    cmd.ExecuteNonQuery(); //ejecutar el comando sql
                    con.Close(); //cerrar la conexion
                    cargarDatos(); //volver a cargar los datos del Grid
                    d.Dispose(); //destruir la ventana de Detalle recien creada
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }

        private void btnEditar_Click(object sender, EventArgs e)
        {
            //si no hay filas en el grid no se puede editar
            if (grid1.RowCount == 0) return;

            //mandar a llamar una ventana de Detalle
            Detalle d = new Detalle();
            //llenar las cajas de texto con los valores del renglon seleccionado en el grid
            d.codigo.Text = grid1.CurrentRow.Cells["Codigo"].Value.ToString();
            d.nombre.Text = grid1.CurrentRow.Cells["Nombre"].Value.ToString();
            d.costo.Text = grid1.CurrentRow.Cells["Costo"].Value.ToString();
            d.precioVenta.Text = grid1.CurrentRow.Cells["PrecioVenta"].Value.ToString();
            d.existencias.Text = grid1.CurrentRow.Cells["Existencia"].Value.ToString();
            d.comentarios.Text = grid1.CurrentRow.Cells["Comentarios"].Value.ToString();
            d.ShowDialog();

            //si d no ha sido destruido o sea no esta en estado Disposed
            //es porque si hizo click en Aceptar.
            if (d.IsDisposed == false)
            {
                //ejecutar el comando de update de sql
                String sql = "UPDATE Producto SET Codigo = @1, Nombre = @2, Costo = @3, PrecioVenta = @4"+
                    ", Existencia = @5, Comentarios = @6 WHERE ProductoID = @7";
                //objeto de conexion
                SqlConnection con = new SqlConnection(Properties.Resources.CadenaConexion);
                //comando de sql
                SqlCommand cmd = new SqlCommand(sql, con);
                //llenar los parametros del comando
                cmd.Parameters.AddWithValue("@1", d.codigo.Text);
                cmd.Parameters.AddWithValue("@2", d.nombre.Text);
                cmd.Parameters.AddWithValue("@3", d.costo.Text);
                cmd.Parameters.AddWithValue("@4", d.precioVenta.Text);
                cmd.Parameters.AddWithValue("@5", d.existencias.Text);
                cmd.Parameters.AddWithValue("@6", d.comentarios.Text);
                cmd.Parameters.AddWithValue("@7", grid1.CurrentRow.Cells["ProductoID"].Value.ToString());
                try
                {
                    con.Open(); //abrir conexion
                    cmd.ExecuteNonQuery(); //ejecutar comando
                    con.Close(); //cerrar conexion
                    cargarDatos();
                    d.Dispose();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }
    }
}
