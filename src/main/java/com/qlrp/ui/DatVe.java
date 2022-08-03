/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlrp.ui;

import com.qlrp.entity.PHIM;
import com.qlrp.utils.XImage;
import java.awt.Color;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author HAN-PC
 */
public class DatVe extends javax.swing.JFrame {

    /**
     * Creates new form DatVe
     */
    public DatVe() {
        initComponents();
        init();
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_ThemVaoGioHang = new rojerusan.RSMaterialButtonRectangle();
        pnl_KhoiChieu2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sp_SoLuong = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        lbl_HinhFilm = new javax.swing.JLabel();
        pnl_KhoiChieu3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_ChonGheNgoi = new rojerusan.RSMaterialButtonRectangle();
        lbl_GheNgoi = new javax.swing.JLabel();
        txt_Tenfilm = new javax.swing.JTextPane();
        pnl_KhoiChieu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_GiaVe = new javax.swing.JLabel();
        pnl_KhoiChieu1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_MaVe = new javax.swing.JLabel();
        pnl_KhoiChieu4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_GhiChu = new javax.swing.JTextPane();
        pnl_KhoiChieu5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_GiaVe1 = new javax.swing.JLabel();
        pnl_KhoiChieu6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbl_GiaVe2 = new javax.swing.JLabel();
        pnl_KhoiChieu7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbl_GiaVe3 = new javax.swing.JLabel();
        pnl_KhoiChieu8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbl_GiaVe4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ĐẶT VÉ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_ThemVaoGioHang.setText("THÊM VÀO GIỎ HÀNG");
        btn_ThemVaoGioHang.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ThemVaoGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(btn_ThemVaoGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        pnl_KhoiChieu2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("SỐ LƯỢNG:");

        sp_SoLuong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sp_SoLuong.setPreferredSize(new java.awt.Dimension(7, 20));
        sp_SoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sp_SoLuongKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_KhoiChieu2Layout = new javax.swing.GroupLayout(pnl_KhoiChieu2);
        pnl_KhoiChieu2.setLayout(pnl_KhoiChieu2Layout);
        pnl_KhoiChieu2Layout.setHorizontalGroup(
            pnl_KhoiChieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieu2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(sp_SoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_KhoiChieu2Layout.setVerticalGroup(
            pnl_KhoiChieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu2Layout.createSequentialGroup()
                .addGroup(pnl_KhoiChieu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_KhoiChieu2Layout.createSequentialGroup()
                        .addComponent(sp_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_KhoiChieu2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        lbl_HinhFilm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlrp/image/PHIM/POSTER/SPIDER - NO WAY HOME.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_HinhFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_HinhFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_KhoiChieu3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("GHẾ NGỒI:");

        btn_ChonGheNgoi.setText("CHỌN GHẾ");
        btn_ChonGheNgoi.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btn_ChonGheNgoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChonGheNgoiActionPerformed(evt);
            }
        });

        lbl_GheNgoi.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_GheNgoi.setText("A2");

        javax.swing.GroupLayout pnl_KhoiChieu3Layout = new javax.swing.GroupLayout(pnl_KhoiChieu3);
        pnl_KhoiChieu3.setLayout(pnl_KhoiChieu3Layout);
        pnl_KhoiChieu3Layout.setHorizontalGroup(
            pnl_KhoiChieu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lbl_GheNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ChonGheNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        pnl_KhoiChieu3Layout.setVerticalGroup(
            pnl_KhoiChieu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnl_KhoiChieu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GheNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(btn_ChonGheNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txt_Tenfilm.setEditable(false);
        txt_Tenfilm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txt_Tenfilm.setText("DOCTOR STRANGE IN THE MULTIVERSE OF MADNESS");
        txt_Tenfilm.setFocusable(false);
        txt_Tenfilm.setOpaque(false);

        pnl_KhoiChieu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("GIÁ VÉ:");

        lbl_GiaVe.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_GiaVe.setForeground(new java.awt.Color(204, 0, 0));
        lbl_GiaVe.setText("35.000 VNĐ");

        javax.swing.GroupLayout pnl_KhoiChieuLayout = new javax.swing.GroupLayout(pnl_KhoiChieu);
        pnl_KhoiChieu.setLayout(pnl_KhoiChieuLayout);
        pnl_KhoiChieuLayout.setHorizontalGroup(
            pnl_KhoiChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieuLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(lbl_GiaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_KhoiChieuLayout.setVerticalGroup(
            pnl_KhoiChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieuLayout.createSequentialGroup()
                .addGroup(pnl_KhoiChieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GiaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pnl_KhoiChieu1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("MÃ VÉ:");

        lbl_MaVe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_MaVe.setText("V001");

        javax.swing.GroupLayout pnl_KhoiChieu1Layout = new javax.swing.GroupLayout(pnl_KhoiChieu1);
        pnl_KhoiChieu1.setLayout(pnl_KhoiChieu1Layout);
        pnl_KhoiChieu1Layout.setHorizontalGroup(
            pnl_KhoiChieu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(lbl_MaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_KhoiChieu1Layout.setVerticalGroup(
            pnl_KhoiChieu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieu1Layout.createSequentialGroup()
                .addGroup(pnl_KhoiChieu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_MaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_KhoiChieu4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("GHI CHÚ:");

        txt_GhiChu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_GhiChu.setMargin(new java.awt.Insets(3, 7, 3, 7));
        jScrollPane1.setViewportView(txt_GhiChu);

        javax.swing.GroupLayout pnl_KhoiChieu4Layout = new javax.swing.GroupLayout(pnl_KhoiChieu4);
        pnl_KhoiChieu4.setLayout(pnl_KhoiChieu4Layout);
        pnl_KhoiChieu4Layout.setHorizontalGroup(
            pnl_KhoiChieu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieu4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_KhoiChieu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieu4Layout.createSequentialGroup()
                    .addContainerGap(96, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        pnl_KhoiChieu4Layout.setVerticalGroup(
            pnl_KhoiChieu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(pnl_KhoiChieu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_KhoiChieu4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnl_KhoiChieu5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("PHÒNG CHIẾU:");

        lbl_GiaVe1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_GiaVe1.setText("PC001");

        javax.swing.GroupLayout pnl_KhoiChieu5Layout = new javax.swing.GroupLayout(pnl_KhoiChieu5);
        pnl_KhoiChieu5.setLayout(pnl_KhoiChieu5Layout);
        pnl_KhoiChieu5Layout.setHorizontalGroup(
            pnl_KhoiChieu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieu5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(lbl_GiaVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl_KhoiChieu5Layout.setVerticalGroup(
            pnl_KhoiChieu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu5Layout.createSequentialGroup()
                .addGroup(pnl_KhoiChieu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GiaVe1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pnl_KhoiChieu6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("ĐỊNH DẠNG PHIM:");

        lbl_GiaVe2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_GiaVe2.setText("PHIM 3D");

        javax.swing.GroupLayout pnl_KhoiChieu6Layout = new javax.swing.GroupLayout(pnl_KhoiChieu6);
        pnl_KhoiChieu6.setLayout(pnl_KhoiChieu6Layout);
        pnl_KhoiChieu6Layout.setHorizontalGroup(
            pnl_KhoiChieu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieu6Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lbl_GiaVe2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_KhoiChieu6Layout.setVerticalGroup(
            pnl_KhoiChieu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu6Layout.createSequentialGroup()
                .addGroup(pnl_KhoiChieu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GiaVe2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pnl_KhoiChieu7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("GIỜ CHIẾU:");

        lbl_GiaVe3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_GiaVe3.setText("15:00:00 - 16:45:00");

        javax.swing.GroupLayout pnl_KhoiChieu7Layout = new javax.swing.GroupLayout(pnl_KhoiChieu7);
        pnl_KhoiChieu7.setLayout(pnl_KhoiChieu7Layout);
        pnl_KhoiChieu7Layout.setHorizontalGroup(
            pnl_KhoiChieu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieu7Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lbl_GiaVe3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_KhoiChieu7Layout.setVerticalGroup(
            pnl_KhoiChieu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu7Layout.createSequentialGroup()
                .addGroup(pnl_KhoiChieu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GiaVe3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pnl_KhoiChieu8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("NGÀY CHIẾU:");

        lbl_GiaVe4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_GiaVe4.setText("2021-12-14");

        javax.swing.GroupLayout pnl_KhoiChieu8Layout = new javax.swing.GroupLayout(pnl_KhoiChieu8);
        pnl_KhoiChieu8.setLayout(pnl_KhoiChieu8Layout);
        pnl_KhoiChieu8Layout.setHorizontalGroup(
            pnl_KhoiChieu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_KhoiChieu8Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lbl_GiaVe4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_KhoiChieu8Layout.setVerticalGroup(
            pnl_KhoiChieu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhoiChieu8Layout.createSequentialGroup()
                .addGroup(pnl_KhoiChieu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GiaVe4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnl_KhoiChieu2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnl_KhoiChieu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnl_KhoiChieu4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pnl_KhoiChieu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(pnl_KhoiChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnl_KhoiChieu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_KhoiChieu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_KhoiChieu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_KhoiChieu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txt_Tenfilm, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Tenfilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnl_KhoiChieu1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_KhoiChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_KhoiChieu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_KhoiChieu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_KhoiChieu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_KhoiChieu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pnl_KhoiChieu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pnl_KhoiChieu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(pnl_KhoiChieu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static DatVe Instance;
    public JLabel lblvitri;
    
    File f = new File("");
    
    private void init() {
        this.setIconImage(XImage.getAppIcon());
        designTextPane(txt_Tenfilm);
        Instance = this;
        lblvitri = lbl_GheNgoi;

    }

    private void designTextPane(JTextPane txt) {
        txt.setOpaque(false);
        txt.setBorder(BorderFactory.createEmptyBorder());
        txt.setBackground(new Color(0, 0, 0, 0));

        StyledDocument style = txt.getStyledDocument();
        SimpleAttributeSet align = new SimpleAttributeSet();
        StyleConstants.setAlignment(align, StyleConstants.ALIGN_CENTER);
        style.setParagraphAttributes(0, style.getLength(), align, false);
    }
    
    public void fillToFormDatVe(PHIM p) {
        try {
            String duongdanPoster = f.getAbsolutePath() + "\\src\\main\\resources\\com\\qlrp\\image\\PHIM\\POSTER\\";
            lbl_HinhFilm.setIcon(XImage.ResizeImage(lbl_HinhFilm.getWidth(), lbl_HinhFilm.getHeight(), duongdanPoster + p.getPOSTER()));
        } catch (Exception e) {
        }
        
        txt_Tenfilm.setText(p.getTEN_PHIM());
    }

    public void setViTriGhe(String vitri) {
        lbl_GheNgoi.setText(vitri);
    }
    
    private void sp_SoLuongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sp_SoLuongKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sp_SoLuongKeyReleased

    public void setViTriNgoi(String vitri) {
        this.lbl_GheNgoi.setText(vitri);
    }
    
    private void btn_ChonGheNgoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChonGheNgoiActionPerformed
        // TODO add your handling code here:
        ChonChoNgoi ccn = new ChonChoNgoi();
        ccn.setVisible(true);  
    }//GEN-LAST:event_btn_ChonGheNgoiActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(DatVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatVe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_ChonGheNgoi;
    private rojerusan.RSMaterialButtonRectangle btn_ThemVaoGioHang;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_GheNgoi;
    private javax.swing.JLabel lbl_GiaVe;
    private javax.swing.JLabel lbl_GiaVe1;
    private javax.swing.JLabel lbl_GiaVe2;
    private javax.swing.JLabel lbl_GiaVe3;
    private javax.swing.JLabel lbl_GiaVe4;
    private javax.swing.JLabel lbl_HinhFilm;
    private javax.swing.JLabel lbl_MaVe;
    private javax.swing.JPanel pnl_KhoiChieu;
    private javax.swing.JPanel pnl_KhoiChieu1;
    private javax.swing.JPanel pnl_KhoiChieu2;
    private javax.swing.JPanel pnl_KhoiChieu3;
    private javax.swing.JPanel pnl_KhoiChieu4;
    private javax.swing.JPanel pnl_KhoiChieu5;
    private javax.swing.JPanel pnl_KhoiChieu6;
    private javax.swing.JPanel pnl_KhoiChieu7;
    private javax.swing.JPanel pnl_KhoiChieu8;
    private javax.swing.JSpinner sp_SoLuong;
    private javax.swing.JTextPane txt_GhiChu;
    private javax.swing.JTextPane txt_Tenfilm;
    // End of variables declaration//GEN-END:variables
}
