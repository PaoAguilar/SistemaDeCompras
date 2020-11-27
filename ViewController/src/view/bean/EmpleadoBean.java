package view.bean;

import oracle.adf.view.rich.event.DialogEvent;

import view.common.MyADFUtil;

public class EmpleadoBean
{
  public EmpleadoBean()
  {
  }

  public void deleteEmpleadoDialogListener(DialogEvent dialogEvent)
  {
    MyADFUtil.executeOperation("Delete");
    MyADFUtil.executeOperation("Commit");
    MyADFUtil.showSuccessfulMessage("Empleado Eliminado con Exito!");
  }
}
