
package GUI;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;


public class QLDangNhap extends javax.swing.JFrame {

    
    public QLDangNhap() {
        initComponents();        
        setLocationRelativeTo(null);
        this.setIcon();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCardParent = new javax.swing.JPanel();
        pnDangNhap = new javax.swing.JPanel();
        btnInstagram = new javax.swing.JButton();
        btnFacebook = new javax.swing.JButton();
        btnEmail = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        txtTenTaiKhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        lblTenTaiKhoan = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblQuenMatKhau = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblQuenMatKhau1 = new javax.swing.JLabel();
        pnDangKy = new javax.swing.JPanel();
        btnInstagram1 = new javax.swing.JButton();
        btnFacebook1 = new javax.swing.JButton();
        btnEmail1 = new javax.swing.JButton();
        txtTenTaiKhoan_DK = new javax.swing.JTextField();
        txtMatKhau_DK = new javax.swing.JPasswordField();
        btnDangKy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblLogo1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtXacNhanMK = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        pnQuenMatKhau = new javax.swing.JPanel();
        lblLogo2 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTenTaiKhoan_QMK = new javax.swing.JTextField();
        btnLayMa = new javax.swing.JButton();
        btnInstagram2 = new javax.swing.JButton();
        btnFacebook2 = new javax.swing.JButton();
        btnEmail2 = new javax.swing.JButton();
        pnXacNhanQMK = new javax.swing.JPanel();
        btnBack2 = new javax.swing.JButton();
        lblLogo3 = new javax.swing.JLabel();
        btnInstagram3 = new javax.swing.JButton();
        btnFacebook3 = new javax.swing.JButton();
        btnEmail3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtMaXacNhan = new javax.swing.JTextField();
        btnXacNhanMa = new javax.swing.JButton();
        pnDatMKMoi = new javax.swing.JPanel();
        btnBack3 = new javax.swing.JButton();
        lblLogo4 = new javax.swing.JLabel();
        btnInstagram4 = new javax.swing.JButton();
        btnFacebook4 = new javax.swing.JButton();
        btnEmail4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtXacNhanMKmoi = new javax.swing.JPasswordField();
        btnDoiMK = new javax.swing.JButton();
        txtMKmoi = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnCardParent.setLayout(new java.awt.CardLayout());

        pnDangNhap.setName("dangNhap"); // NOI18N

        btnInstagram.setBorder(null);
        btnInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstagramActionPerformed(evt);
            }
        });

        btnFacebook.setBorder(null);
        btnFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebookActionPerformed(evt);
            }
        });

        btnEmail.setBorder(null);

        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTenTaiKhoan.setPreferredSize(new java.awt.Dimension(32, 32));

        lblMatKhau.setPreferredSize(new java.awt.Dimension(32, 32));

        lblQuenMatKhau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQuenMatKhau.setText("Quên mật khẩu ?");
        lblQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên tài khoản");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Mật khẩu");

        jButton1.setText("Đăng nhập");
        jButton1.setPreferredSize(new java.awt.Dimension(85, 27));

        lblQuenMatKhau1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQuenMatKhau1.setText("Đăng ký tài khoản");
        lblQuenMatKhau1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatKhau1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnDangNhapLayout = new javax.swing.GroupLayout(pnDangNhap);
        pnDangNhap.setLayout(pnDangNhapLayout);
        pnDangNhapLayout.setHorizontalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDangNhapLayout.createSequentialGroup()
                                .addComponent(lblTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnDangNhapLayout.createSequentialGroup()
                                .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                                        .addComponent(lblQuenMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblQuenMatKhau1))
                                    .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(82, 82, 82)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)))))
                .addGap(204, 204, 204))
        );
        pnDangNhapLayout.setVerticalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuenMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuenMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pnDangNhapLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMatKhau, txtTenTaiKhoan});

        pnCardParent.add(pnDangNhap, "cardDangNhap");

        pnDangKy.setName("dangKy"); // NOI18N

        btnInstagram1.setBorder(null);
        btnInstagram1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstagram1ActionPerformed(evt);
            }
        });

        btnFacebook1.setBorder(null);
        btnFacebook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebook1ActionPerformed(evt);
            }
        });

        btnEmail1.setBorder(null);

        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Mật khẩu");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Tên tài khoản");

        lblLogo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Xác nhận mật khẩu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Email");

        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDangKyLayout = new javax.swing.GroupLayout(pnDangKy);
        pnDangKy.setLayout(pnDangKyLayout);
        pnDangKyLayout.setHorizontalGroup(
            pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangKyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(btnInstagram1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFacebook1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(pnDangKyLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenTaiKhoan_DK, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhau_DK, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        pnDangKyLayout.setVerticalGroup(
            pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangKyLayout.createSequentialGroup()
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDangKyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInstagram1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFacebook1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnDangKyLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addGroup(pnDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDangKyLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDangKyLayout.createSequentialGroup()
                        .addComponent(txtTenTaiKhoan_DK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatKhau_DK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtXacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnDangKy, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        pnDangKyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, jLabel8, txtEmail, txtMatKhau_DK, txtTenTaiKhoan_DK, txtXacNhanMK});

        pnCardParent.add(pnDangKy, "cardDangKy");

        lblLogo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBack1.setBorder(null);
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Tên tài khoản");

        btnLayMa.setText("Lấy mã");
        btnLayMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLayMaActionPerformed(evt);
            }
        });

        btnInstagram2.setBorder(null);
        btnInstagram2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstagram2ActionPerformed(evt);
            }
        });

        btnFacebook2.setBorder(null);
        btnFacebook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebook2ActionPerformed(evt);
            }
        });

        btnEmail2.setBorder(null);

        javax.swing.GroupLayout pnQuenMatKhauLayout = new javax.swing.GroupLayout(pnQuenMatKhau);
        pnQuenMatKhau.setLayout(pnQuenMatKhauLayout);
        pnQuenMatKhauLayout.setHorizontalGroup(
            pnQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuenMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnQuenMatKhauLayout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addComponent(lblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(btnInstagram2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFacebook2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(pnQuenMatKhauLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLayMa, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenTaiKhoan_QMK, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(187, 187, 187))))
        );
        pnQuenMatKhauLayout.setVerticalGroup(
            pnQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuenMatKhauLayout.createSequentialGroup()
                .addGroup(pnQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnQuenMatKhauLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInstagram2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFacebook2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnQuenMatKhauLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(pnQuenMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenTaiKhoan_QMK, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(btnLayMa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pnCardParent.add(pnQuenMatKhau, "cardQuenMK");

        btnBack2.setBorder(null);
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        lblLogo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnInstagram3.setBorder(null);
        btnInstagram3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstagram3ActionPerformed(evt);
            }
        });

        btnFacebook3.setBorder(null);
        btnFacebook3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebook3ActionPerformed(evt);
            }
        });

        btnEmail3.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Mã xác nhận");

        btnXacNhanMa.setText("Xác nhận");
        btnXacNhanMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanMaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnXacNhanQMKLayout = new javax.swing.GroupLayout(pnXacNhanQMK);
        pnXacNhanQMK.setLayout(pnXacNhanQMKLayout);
        pnXacNhanQMKLayout.setHorizontalGroup(
            pnXacNhanQMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXacNhanQMKLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnXacNhanQMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnXacNhanQMKLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnXacNhanQMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXacNhanMa, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnXacNhanQMKLayout.createSequentialGroup()
                        .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addComponent(lblLogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(btnInstagram3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFacebook3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        pnXacNhanQMKLayout.setVerticalGroup(
            pnXacNhanQMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXacNhanQMKLayout.createSequentialGroup()
                .addGroup(pnXacNhanQMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnXacNhanQMKLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnXacNhanQMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnXacNhanQMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInstagram3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFacebook3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnXacNhanQMKLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblLogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(pnXacNhanQMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaXacNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(btnXacNhanMa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pnCardParent.add(pnXacNhanQMK, "cardXacNhanMK");

        btnBack3.setBorder(null);
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        lblLogo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnInstagram4.setBorder(null);
        btnInstagram4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstagram4ActionPerformed(evt);
            }
        });

        btnFacebook4.setBorder(null);
        btnFacebook4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacebook4ActionPerformed(evt);
            }
        });

        btnEmail4.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Mật khẩu mới");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Xác nhận mật khẩu");

        btnDoiMK.setText("Đổi mật khẩu");
        btnDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDatMKMoiLayout = new javax.swing.GroupLayout(pnDatMKMoi);
        pnDatMKMoi.setLayout(pnDatMKMoiLayout);
        pnDatMKMoiLayout.setHorizontalGroup(
            pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatMKMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDatMKMoiLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lblLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(btnInstagram4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFacebook4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDatMKMoiLayout.createSequentialGroup()
                        .addGroup(pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtXacNhanMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        pnDatMKMoiLayout.setVerticalGroup(
            pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDatMKMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInstagram4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFacebook4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnDatMKMoiLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addGroup(pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDatMKMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtXacNhanMKmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pnCardParent.add(pnDatMKMoi, "cardDatMKMoi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCardParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCardParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void lblQuenMatKhau1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhau1MouseClicked
        this.setCardDangKy();
    }//GEN-LAST:event_lblQuenMatKhau1MouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setCardDangNhap();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        this.setCardDangNhap();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnLayMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLayMaActionPerformed
        this.setCardXacNhanMK();
    }//GEN-LAST:event_btnLayMaActionPerformed

    private void lblQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseClicked
        this.setCardQuenMK();
    }//GEN-LAST:event_lblQuenMatKhauMouseClicked

    private void btnFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebookActionPerformed
        this.linkFacebook();
    }//GEN-LAST:event_btnFacebookActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        this.setCardQuenMK();
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnXacNhanMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanMaActionPerformed
        this.setCardDatMKMoi();
    }//GEN-LAST:event_btnXacNhanMaActionPerformed

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        this.setCardXacNhanMK();
    }//GEN-LAST:event_btnBack3ActionPerformed

    private void btnDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoiMKActionPerformed

    private void btnInstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstagramActionPerformed
        this.linkInstagram();
    }//GEN-LAST:event_btnInstagramActionPerformed

    private void btnInstagram1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstagram1ActionPerformed
        this.linkInstagram();
    }//GEN-LAST:event_btnInstagram1ActionPerformed

    private void btnFacebook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebook1ActionPerformed
        this.linkFacebook();
    }//GEN-LAST:event_btnFacebook1ActionPerformed

    private void btnInstagram2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstagram2ActionPerformed
        this.linkInstagram();
    }//GEN-LAST:event_btnInstagram2ActionPerformed

    private void btnFacebook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebook2ActionPerformed
        this.linkFacebook();
    }//GEN-LAST:event_btnFacebook2ActionPerformed

    private void btnInstagram3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstagram3ActionPerformed
        this.linkInstagram();
    }//GEN-LAST:event_btnInstagram3ActionPerformed

    private void btnFacebook3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebook3ActionPerformed
        this.linkFacebook();
    }//GEN-LAST:event_btnFacebook3ActionPerformed

    private void btnInstagram4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstagram4ActionPerformed
        this.linkInstagram();
    }//GEN-LAST:event_btnInstagram4ActionPerformed

    private void btnFacebook4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacebook4ActionPerformed
        this.linkFacebook();
    }//GEN-LAST:event_btnFacebook4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnEmail1;
    private javax.swing.JButton btnEmail2;
    private javax.swing.JButton btnEmail3;
    private javax.swing.JButton btnEmail4;
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnFacebook1;
    private javax.swing.JButton btnFacebook2;
    private javax.swing.JButton btnFacebook3;
    private javax.swing.JButton btnFacebook4;
    private javax.swing.JButton btnInstagram;
    private javax.swing.JButton btnInstagram1;
    private javax.swing.JButton btnInstagram2;
    private javax.swing.JButton btnInstagram3;
    private javax.swing.JButton btnInstagram4;
    private javax.swing.JButton btnLayMa;
    private javax.swing.JButton btnXacNhanMa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblLogo3;
    private javax.swing.JLabel lblLogo4;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblQuenMatKhau;
    private javax.swing.JLabel lblQuenMatKhau1;
    private javax.swing.JLabel lblTenTaiKhoan;
    private javax.swing.JPanel pnCardParent;
    private javax.swing.JPanel pnDangKy;
    private javax.swing.JPanel pnDangNhap;
    private javax.swing.JPanel pnDatMKMoi;
    private javax.swing.JPanel pnQuenMatKhau;
    private javax.swing.JPanel pnXacNhanQMK;
    private javax.swing.JPasswordField txtEmail;
    private javax.swing.JPasswordField txtMKmoi;
    private javax.swing.JTextField txtMaXacNhan;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhau_DK;
    private javax.swing.JTextField txtTenTaiKhoan;
    private javax.swing.JTextField txtTenTaiKhoan_DK;
    private javax.swing.JTextField txtTenTaiKhoan_QMK;
    private javax.swing.JPasswordField txtXacNhanMK;
    private javax.swing.JPasswordField txtXacNhanMKmoi;
    // End of variables declaration//GEN-END:variables

    private void setIcon(){
        try {
            String pathFacebook = "src/Image/facebook.png";
            ImageIcon facebook = new ImageIcon(new ImageIcon(pathFacebook).getImage());
            btnFacebook.setIcon(facebook);
            btnFacebook1.setIcon(facebook);
            btnFacebook2.setIcon(facebook);
            btnFacebook3.setIcon(facebook);
            btnFacebook4.setIcon(facebook);
            
            String pathIstagram = "src/Image/instagram.png";
            ImageIcon instagram = new ImageIcon(new ImageIcon(pathIstagram).getImage());
            btnInstagram.setIcon(instagram);
            btnInstagram1.setIcon(instagram);
            btnInstagram2.setIcon(instagram);
            btnInstagram3.setIcon(instagram);
            btnInstagram4.setIcon(instagram);
            
            String pathEmail = "src/Image/email.png";
            ImageIcon email = new ImageIcon(new ImageIcon(pathEmail).getImage());
            btnEmail.setIcon(email);
            btnEmail1.setIcon(email);
            btnEmail2.setIcon(email);
            btnEmail3.setIcon(email);
            btnEmail4.setIcon(email);
            
            String pathLogo = "src/Image/logo.png";
            ImageIcon logo = new ImageIcon(new ImageIcon(pathLogo).getImage());
            lblLogo.setIcon(logo);
            lblLogo1.setIcon(logo);
            lblLogo2.setIcon(logo);
            lblLogo3.setIcon(logo);
            lblLogo4.setIcon(logo);
            
            String pathUserName = "src/Image/userName.png";
            ImageIcon userName = new ImageIcon(new ImageIcon(pathUserName).getImage());
            lblTenTaiKhoan.setIcon(userName);
            
            String pathPassWord = "src/Image/password.png";
            ImageIcon password = new ImageIcon(new ImageIcon(pathPassWord).getImage());
            lblMatKhau.setIcon(password);
            
            String pathBack = "src/Image/back.png";
            ImageIcon back = new ImageIcon(new ImageIcon(pathBack).getImage());
            btnBack.setIcon(back);
            btnBack1.setIcon(back);
            btnBack2.setIcon(back);
            btnBack3.setIcon(back);            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    CardLayout cardParent;
    private void setCardDangKy(){
        try {
            cardParent = (CardLayout) pnCardParent.getLayout();
            cardParent.show(pnCardParent, "cardDangKy");           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void setCardDangNhap(){
        try {
            cardParent = (CardLayout) pnCardParent.getLayout();
            cardParent.show(pnCardParent, "cardDangNhap");           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void setCardQuenMK(){
        try {
            cardParent = (CardLayout) pnCardParent.getLayout();
            cardParent.show(pnCardParent, "cardQuenMK");  
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void setCardXacNhanMK(){
        try {
            cardParent = (CardLayout) pnCardParent.getLayout();
            cardParent.show(pnCardParent, "cardXacNhanMK");  
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void setCardDatMKMoi(){
        try {
            cardParent = (CardLayout) pnCardParent.getLayout();
            cardParent.show(pnCardParent, "cardDatMKMoi");  
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void linkFacebook(){
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.facebook.com/trun01/"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch(URISyntaxException e){            
            e.printStackTrace();
        }
    }
    
    private void linkInstagram(){
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://www.instagram.com/trunn01/"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch(URISyntaxException e){            
            e.printStackTrace();
        }
    }
    
}
