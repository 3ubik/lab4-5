package lab4;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
public class GraphicsDisplay extends JPanel {
	
	// ������ ��������� ����� ��� ���������� �������
	private Double[][] graphicsData;
	// �������� ����������, �������� ������� ����������� �������
	private boolean showAxis = true;
	private boolean showMarkers = true;
	// ������� ��������� ������������, ����������� �����������
	private double minX;
	private double maxX;
	private double minY;
	private double maxY;
	// ������������ ������� �����������
	private double scale;
	// ��������� ����� �������� �����
	private BasicStroke graphicsStroke;
	private BasicStroke axisStroke;
	private BasicStroke markerStroke;
	// ��������� ������ ����������� ��������
	private Font axisFont;
	
	
	public GraphicsDisplay() {
		// ���� ������� ���� ������� ����������� - �����
		setBackground(Color.WHITE);
		// ��������������� ����������� �������, ������������ � ���������
		// ���� ��� ��������� �������
		graphicsStroke = new BasicStroke(2.0f, BasicStroke.CAP_BUTT,
		BasicStroke.JOIN_ROUND, 10.0f, null, 0.0f);
		// ���� ��� ��������� ���� ���������
		axisStroke = new BasicStroke(2.0f, BasicStroke.CAP_BUTT,
		BasicStroke.JOIN_MITER, 10.0f, null, 0.0f);
		// ���� ��� ��������� �������� ��������
		markerStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
		BasicStroke.JOIN_MITER, 10.0f, null, 0.0f);
		// ����� ��� �������� ���� ���������
		axisFont = new Font("Serif", Font.BOLD, 36);
		}
	
	// ����� ���������� �� ����������� �������� ���� "������� ���� � ��������"
	// �������� ���� ���������� � ������ �������� �������� ������
	public void showGraphics(Double[][] graphicsData) {
		// ��������� ������ ����� �� ���������� ���� ������
		this.graphicsData = graphicsData;
		// ��������� ����������� ���������� (������ ������� paintComponent())
		repaint();
	}
	
	// ������-������������ ��� ��������� ���������� ����������� �������
	// ��������� ������ ��������� �������� � ����������� �������
	public void setShowAxis(boolean showAxis) {
		this.showAxis = showAxis;
		repaint();
	}
	public void setShowMarkers(boolean showMarkers) {
			this.showMarkers = showMarkers;
			repaint();
		}

	
	


}
