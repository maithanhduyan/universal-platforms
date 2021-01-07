<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- SCRIPTS -->
<!-- jQuery -->
<script src="/adminlte/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="/adminlte/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="/adminlte/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Web Socket  -->
<!-- reference: https://cdnjs.com/libraries/sockjs-client -->
<script src="/sockjs-client/sockjs.min.js"></script>
<!-- reference: https://cdnjs.com/libraries/stomp.js/ -->
<script src="/stomp-websocket/stomp.min.js"></script>
<!-- overlayScrollbars -->
<script src="/adminlte/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- AdminLTE App -->
<script src="/adminlte/dist/js/adminlte.js"></script>

<!-- AdminLTE for demo purposes -->
<script src="/adminlte/dist/js/demo.js"></script>
<script src="/jquery.easing/jquery.easing.min.js"></script>
<script src="/aos/aos.js"></script>
<script src="/js/main.js"></script>
<!-- CUSTOM SCRIPTS -->
<script type="text/javascript">
    $.ajaxSetup({
        beforeSend : function (xhr) {
            xhr.setRequestHeader('Authorization', 'Bearer...');
        },
        headers : {
            'X-CSRF-TOKEN' : 'CSRF-TOKEN ON HTML HEADER'
        }
    });
    $.ajax({
        url : "/healthCheck",
        contentType : "application/json",
        type : 'POST',
        success : function (data, status, xhr) {
            if (status === '200') {

            }
        },
        error : function (e) {
            console.log(e)
        }
    });
</script>