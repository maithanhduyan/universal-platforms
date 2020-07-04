 <!-- ======= Footer ======= -->
 <footer id="footer">
     @yield('newsletter')
     <div class="footer-top">
         <div class="container">
             <div class="row">

                 <div class="col-lg-3 col-md-6 footer-contact" data-aos="fade-up">
                     <h3>TayaFood</h3>
                     <p>
                         {!! Company::getModel()->address !!}
                         <strong>Phone:</strong> {!! Company::getModel()->phone !!}<br>
                         <strong>Email:</strong> {!! Company::getModel()->email !!}<br>
                     </p>
                 </div>

                 <div class="col-lg-3 col-md-6 footer-links" data-aos="fade-up" data-aos-delay="100">
                     <h4>Liên Kết</h4>
                     <ul>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Home</a></li>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Công Ty</a></li>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Dịch Vụ</a></li>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Điều khoản dịch vụ</a></li>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Chính sách bảo mật</a></li>
                     </ul>
                 </div>

                 <div class="col-lg-3 col-md-6 footer-links" data-aos="fade-up" data-aos-delay="200">
                     <h4>Dịch vụ</h4>
                     <ul>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Sản Xuất</a></li>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Giao Vận</a></li>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Kho Bãi</a></li>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Phân Phối</a></li>
                         <li><i class="bx bx-chevron-right"></i> <a href="#">Thiết kế</a></li>
                     </ul>
                 </div>

                 <div class="col-lg-3 col-md-6 footer-links" data-aos="fade-up" data-aos-delay="300">
                     <h4>Mạng Xã Hội</h4>
                     <p>Kết nối với TAYAFOOD qua các kênh của bạn</p>
                     <div class="social-links mt-3">
                         <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                         <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                         <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                         <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                         <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                     </div>
                 </div>

             </div>
         </div>
     </div>

     <div class="container py-4 footer-bottom">
         <div class="copyright">
             &copy; Copyright <strong><span>TAYAFOOD.COM</span></strong>. All Rights Reserved
         </div>
         <div class="credits">
             <!-- All the links in the footer should remain intact. -->
             <!-- You can delete the links only if you purchased the pro version. -->
             <!-- Licensing information: https://bootstrapmade.com/license/ -->
             <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/free-bootstrap-app-landing-page-template/ -->
             Designed by <a href="#">TAYA-IT Department</a>
         </div>
     </div>
 </footer><!-- End Footer -->