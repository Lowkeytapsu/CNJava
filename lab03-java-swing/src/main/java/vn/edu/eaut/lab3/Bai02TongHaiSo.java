package vn.edu.eaut.lab3;

import javax.swing.*;
import java.awt.*;

public class Bai02TongHaiSo extends JFrame {

    private final JTextField txtA = new JTextField();
    private final JTextField txtB = new JTextField();
    private final JLabel lblResult = new JLabel("Kết quả: ");

    public Bai02TongHaiSo() {

        // Tiêu đề cửa sổ
        setTitle("Bài 2 - Tính tổng hai số");

        // Đóng cửa sổ thì kết thúc chương trình
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sử dụng GridLayout 4 dòng, 2 cột
        setLayout(new GridLayout(4, 2, 8, 8));

        // Ô nhập số thứ nhất
        add(new JLabel("Số thứ nhất:"));
        add(txtA);

        // Ô nhập số thứ hai
        add(new JLabel("Số thứ hai:"));
        add(txtB);

        // Nút Tính tổng
        JButton btnSum = new JButton("Tính tổng");

        // Nút Làm mới
        JButton btnClear = new JButton("Làm mới");

        add(btnSum);
        add(btnClear);

        // Ô trống
        add(new JLabel(""));

        // Hiển thị kết quả
        add(lblResult);

        // Sự kiện nút Tính tổng
        btnSum.addActionListener(e -> tinhTong());

        // Sự kiện nút Làm mới
        btnClear.addActionListener(e -> lamMoi());

        // Kích thước cửa sổ
        setSize(380, 190);

        // Đưa cửa sổ ra giữa màn hình
        setLocationRelativeTo(null);
    }

    // Hàm tính tổng hai số
    private void tinhTong() {
        try {
            double a = Double.parseDouble(txtA.getText().trim());
            double b = Double.parseDouble(txtB.getText().trim());

            double tong = a + b;

            lblResult.setText("Kết quả: " + tong);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Dữ liệu nhập phải là số hợp lệ!"
            );
        }
    }

    // Hàm làm mới
    private void lamMoi() {
        txtA.setText("");
        txtB.setText("");

        lblResult.setText("Kết quả: ");

        // Đưa con trỏ về ô số thứ nhất
        txtA.requestFocus();
    }

    // Hàm main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new Bai02TongHaiSo().setVisible(true)
        );
    }
}
