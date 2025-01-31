/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing.swavecomponent;

import component.EventItem;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import entity.PlayList;
import swing.utilcomponent.ScrollBarCustom;

/**
 *
 * @author Phan Qui Duc
 */
public class MenuBar extends javax.swing.JPanel {

    /**
     * Creates new form MenuBar
     */
    
    private EventItem eventPnlPlaylistItem;

    public EventItem getEventPnlPlaylistItem() {
        return eventPnlPlaylistItem;
    }

    public void setEventPnlPlaylistItem(EventItem eventPnlPlaylistItem) {
        this.eventPnlPlaylistItem = eventPnlPlaylistItem;
    }
    
    public MenuBar() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        pnlHome = new swing.swavecomponent.AppItem();
        pnlMyPlaylists = new swing.swavecomponent.AppItem();
        pnlAddSong = new swing.swavecomponent.AppItem();
        pnlCreatePlaylist = new swing.swavecomponent.AppItem();
        pnlLikedSong = new swing.swavecomponent.AppItem();
        jSeparator1 = new javax.swing.JSeparator();
        scrPane = new javax.swing.JScrollPane();
        pnlPlaylistList = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(249, 663));
        setMinimumSize(new java.awt.Dimension(249, 663));
        setPreferredSize(new java.awt.Dimension(249, 663));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10);
        flowLayout1.setAlignOnBaseline(true);
        setLayout(flowLayout1);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        lblLogo.setText("              ");
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        add(lblLogo);

        pnlMenu.setPreferredSize(new java.awt.Dimension(249, 228));
        pnlMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));
        pnlMenu.add(pnlHome);

        pnlMyPlaylists.setName(""); // NOI18N
        pnlMenu.add(pnlMyPlaylists);
        pnlMenu.add(pnlAddSong);
        pnlMenu.add(pnlCreatePlaylist);
        pnlMenu.add(pnlLikedSong);

        pnlMenu.setBackground(new Color(0,0,0,255));

        add(pnlMenu);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(160, 2));
        add(jSeparator1);

        scrPane.setBorder(null);
        scrPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrPane.setMinimumSize(new java.awt.Dimension(249, 500));
        scrPane.setName(""); // NOI18N
        scrPane.setPreferredSize(new java.awt.Dimension(249, 500));
        scrPane.setRequestFocusEnabled(false);

        pnlPlaylistList.setMaximumSize(new java.awt.Dimension(249, 32767));
        pnlPlaylistList.setMinimumSize(new java.awt.Dimension(249, 10));
        pnlPlaylistList.setName(""); // NOI18N
        pnlPlaylistList.setPreferredSize(new java.awt.Dimension(249, 57));
        pnlPlaylistList.setBackground(new Color(0,0,0,255));
        pnlPlaylistList.setLayout(new java.awt.GridBagLayout());
        scrPane.setViewportView(pnlPlaylistList);

        add(scrPane);
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblLogoMouseClicked

    public AppItem getPnlHome() {
        return pnlHome;
    }

    public void setPnlHome(AppItem pnlHome) {
        this.pnlHome = pnlHome;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JLabel getLblLogo() {
        return lblLogo;
    }

    public void setLblLogo(JLabel lblLogo) {
        this.lblLogo = lblLogo;
    }

    public AppItem getPnlAddSong() {
        return pnlAddSong;
    }

    public void setPnlAddSong(AppItem pnlAddSong) {
        this.pnlAddSong = pnlAddSong;
    }

    public AppItem getPnlCreatePlaylist() {
        return pnlCreatePlaylist;
    }

    public void setPnlCreatePlaylist(AppItem pnlCreatePlaylist) {
        this.pnlCreatePlaylist = pnlCreatePlaylist;
    }

    public AppItem getPnlLikedSong() {
        return pnlLikedSong;
    }

    public void setPnlLikedSong(AppItem pnlLikedSong) {
        this.pnlLikedSong = pnlLikedSong;
    }

    public AppItem getPnlMyPlaylists() {
        return pnlMyPlaylists;
    }

    public void setPnlMyPlaylists(AppItem pnlMyPlaylists) {
        this.pnlMyPlaylists = pnlMyPlaylists;
    }

    public JPanel getPnlMenu() {
        return pnlMenu;
    }

    public void setPnlMenu(JPanel pnlMenu) {
        this.pnlMenu = pnlMenu;
    }

    public JPanel getPnlPlaylistList() {
        return pnlPlaylistList;
    }

    public void setPnlPlaylistList(JPanel pnlPlaylistList) {
        this.pnlPlaylistList = pnlPlaylistList;
    }

    public JScrollPane getScrPane() {
        return scrPane;
    }

    public void setScrPane(JScrollPane scrPane) {
        this.scrPane = scrPane;
    }

    private void init() {
        setBackground(new Color(0, 0, 0, 255));
        scrPane.setBackground(new Color(0, 0, 0, 255));
        scrPane.setVerticalScrollBar(new ScrollBarCustom());

        // Set Name
        pnlAddSong.setName("pnlAddSong");
        pnlMyPlaylists.setName("pnlMyPlaylists");
        pnlCreatePlaylist.setName("pnlCreatePlaylist");
        pnlLikedSong.setName("pnlLikedSong");
        pnlHome.setName("pnlHome");

        // Set icon
        pnlAddSong.getLblIcon().setIcon(new ImageIcon(getClass().getResource("/icons/components/addSongIcon.png")));
        pnlAddSong.getLblName().setIcon(new ImageIcon(getClass().getResource("/icons/components/addSong.png")));
        pnlMyPlaylists.getLblIcon().setIcon(new ImageIcon(getClass().getResource("/icons/components/myPlaylistIcon.png")));
        pnlMyPlaylists.getLblName().setIcon(new ImageIcon(getClass().getResource("/icons/components/myPlaylist.png")));
        pnlCreatePlaylist.getLblIcon().setIcon(new ImageIcon(getClass().getResource("/icons/components/createPlaylistIcon.png")));
        pnlCreatePlaylist.getLblName().setIcon(new ImageIcon(getClass().getResource("/icons/components/createPlaylist.png")));
        pnlLikedSong.getLblIcon().setIcon(new ImageIcon(getClass().getResource("/icons/components/likedSongIcon.png")));
        pnlLikedSong.getLblName().setIcon(new ImageIcon(getClass().getResource("/icons/components/likedSong.png")));
        pnlHome.getLblIcon().setIcon(new ImageIcon(getClass().getResource("/icons/components/homeIcon.png")));
        pnlHome.getLblName().setIcon(new ImageIcon(getClass().getResource("/icons/components/home.png")));
    }

    public void addPlaylistList(PlayList playlist) {
        int postition = pnlPlaylistList.getComponentCount();
        GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = postition;
        PlaylistLabel pl = new PlaylistLabel();
        pl.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                eventPnlPlaylistItem.clickEvent(pl, playlist);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
            
            
        });
        pl.getLblNamePlaylist().setText(playlist.getPlaylistName());
        pnlPlaylistList.add(pl, gridBagConstraints);
        
        // 4 dòng dưới để khiến cho panel có height của các components nằm bên trong
        pnlPlaylistList.setPreferredSize(null);
        pnlPlaylistList.setMaximumSize(new Dimension(pnlPlaylistList.getMaximumSize().width, pnlPlaylistList.getPreferredSize().height));
        pnlPlaylistList.validate();
        pnlPlaylistList.repaint();

        // set height của scroll pane 
        scrPane.setPreferredSize(new Dimension(pnlPlaylistList.getMaximumSize().width, 320));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLogo;
    private swing.swavecomponent.AppItem pnlAddSong;
    private swing.swavecomponent.AppItem pnlCreatePlaylist;
    private swing.swavecomponent.AppItem pnlHome;
    private swing.swavecomponent.AppItem pnlLikedSong;
    private javax.swing.JPanel pnlMenu;
    private swing.swavecomponent.AppItem pnlMyPlaylists;
    private javax.swing.JPanel pnlPlaylistList;
    private javax.swing.JScrollPane scrPane;
    // End of variables declaration//GEN-END:variables
}
