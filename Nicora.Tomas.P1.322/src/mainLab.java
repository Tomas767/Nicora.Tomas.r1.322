public class mainLab {
    public static void main(String[] args) {
        LabTenologico lb = new LabTenologico();
        
        ModeloMachineLearning mml = new ModeloMachineLearning("ChatPNG", "Los titos", EstadoActual.ESTRENANDO_MODELO, 89);
        ModeloMachineLearning mm2 = new ModeloMachineLearning("DeepSeco", "Los titos", EstadoActual.EN_DESARROLLO, 30);
        
        SistemaDeVisualizacion sv = new SistemaDeVisualizacion(50, "Nvidia Graphics", "Los chinos", EstadoActual.FINALIZADO);
        
        AnalisisEstadistico ae = new AnalisisEstadistico(TipoAnalisis.PREDICTIVO, "LecturaAnalitica", "Los chinos", EstadoActual.FINALIZADO);
        AnalisisEstadistico ae2 = new AnalisisEstadistico(TipoAnalisis.PREDICTIVO, "LecturaAnalitica", "Los chinos", EstadoActual.EN_DESARROLLO);
        
        lb.agregarProyecto(ae);
        lb.agregarProyecto(mml);
        lb.agregarProyecto(mm2);
        lb.agregarProyecto(sv);
        
        lb.actualizarResultados();
        
        lb.mostrarProyectos();
        
        mml.IntentarActualizarEstado(EstadoActual.FINALIZADO);
        
        
        
    }
}
