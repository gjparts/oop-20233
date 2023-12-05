using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace crud_20233
{
    public partial class Detalle : Form
    {
        public Detalle()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //cerrar el form mediante la destruccion del objeto actual en memoria
            this.Dispose();
        }

        private void btnAceptar_Click(object sender, EventArgs e)
        {
            //hacer la validacion de los datos del form
            try
            {
                //nombre y codigo no pueden ir en blanco
                if (this.codigo.Text.Trim().Length == 0)
                {
                    MessageBox.Show("Codigo es obligatorio");
                    codigo.Focus(); //posicionarse en la caja de texto
                    return; //no sigue
                }
                if ( this.nombre.Text.Trim().Length == 0 )
                {
                    MessageBox.Show("Nombre es obligatorio");
                    nombre.Focus(); //posicionarse en la caja de texto
                    return; //no sigue
                }
                if(Double.Parse( this.costo.Text) < 0 || Double.Parse(this.precioVenta.Text) < 0)
                {
                    MessageBox.Show("Costo/Precio Venta deben ser >= 0");
                    return; //no sigue
                }
                Double.Parse(this.existencias.Text); //probar la conversion de existencias a numero
                //si llego hasta aqui todo salio bien, ocultar este Form (sin destruirlo)
                this.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Revise que las cajas para numeros tengan al menor un valor.\n"+ex.Message);
            }
        }
    }
}
