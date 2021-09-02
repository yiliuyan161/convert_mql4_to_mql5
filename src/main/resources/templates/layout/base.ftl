
<#macro head>

</#macro>

<#macro content>
    <h1>Basic Page</h1>
    <p>This is the body of the page!</p>
</#macro>

<#macro display_page title keywords description nav>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="keywords" content="${keywords}">
        <meta name="description" content="${description}">
        <title>${title}</title>
        <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/5.6.3/css/all.min.css">
        <link href="https://cdn.staticfile.org/twitter-bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.staticfile.org/mdbootstrap/4.14.0/css/mdb.min.css" rel="stylesheet">
        <link href="/css/style.css" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href="/img/favicon.ico">
        <@head/>
        <script>
            var _hmt = _hmt || [];
            (function() {
                var hm = document.createElement("script");
                hm.src = "https://hm.baidu.com/hm.js?f013317c1c028a064c1a45de2ec1fafc";
                var s = document.getElementsByTagName("script")[0];
                s.parentNode.insertBefore(hm, s);
            })();
        </script>
        <!-- Global site tag (gtag.js) - Google Analytics -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=UA-15172585-10"></script>
        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag(){dataLayer.push(arguments);}
            gtag('js', new Date());

            gtag('config', 'UA-15172585-10');
        </script>

    </head>
    <body>
    <!--Main Navigation-->
    <header>
        <!-- Navbar -->
        <nav class="navbar fixed-top navbar-expand-lg navbar-light">
            <div class="container">
                <!-- Brand -->
                <a class="navbar-brand waves-effect" href="/" target="_blank">
                    <img src="/img/logo.png" height="30" alt="mdb logo">
                </a>

                <!-- Collapse -->
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <!-- Links -->
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <!-- Left -->
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link btn btn-sm btn-primary" href="#"><b>MQL4 Convert</b>
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
<#--                        <li class="nav-item">-->
<#--                            <a class="nav-link waves-effect" href="/backtest" target="_blank">EA Reports</a>-->
<#--                        </li>-->
<#--                        <li class="nav-item">-->
<#--                            <a class="nav-link waves-effect" href="/" target="_blank">Free EA</a>-->
<#--                        </li>-->

                    </ul>
                </div>

            </div>
        </nav>
        <!-- Navbar -->

    </header>
    <!--Main Navigation-->
    <!--Main layout-->
    <main class="mt-5 pt-5">
        <div class="container">
            <@content/>
        </div>
    </main>
    <!--Footer-->
    <footer class="page-footer text-center font-small mdb-color darken-2 mt-4 wow fadeIn">
        <hr class="my-2">
        <!--Copyright-->
        <div class="footer-copyright py-3">
            © 2020 Copyright:MQL4TO5.COM
        </div>
        <!--/.Copyright-->

    </footer>
    <script type="text/javascript" src="https://cdn.staticfile.org/jquery/3.4.1/jquery.min.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="https://cdn.staticfile.org/popper.js/1.16.1/umd/popper.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="https://cdn.staticfile.org/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="https://cdn.staticfile.org/mdbootstrap/4.14.0/js/mdb.min.js"></script>
    </body>

    </html>
</#macro>
<#macro  pageNav page totalPage urlPrefix>
    <!--Pagination-->
    <nav class="d-flex justify-content-center wow fadeIn">
        <ul class="pagination pg-blue">
            <#if (page<2)>
                <li class="page-item disabled">
                    <a class="page-link" href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                        <span class="sr-only">Previous</span>
                    </a>
                </li>
            <#else>
                <li class="page-item">
                    <a class="page-link" href="${urlPrefix}&page=${page-1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                        <span class="sr-only">Previous</span>
                    </a>
                </li>
            </#if>
            <#if (page>1)>
               <li class="page-item">
                    <a class="page-link" href="${urlPrefix}&page=${page-1}">${page-1}</a>
                </li>
            </#if>
            <li class="page-item active">
                <a class="page-link" href="${urlPrefix}&page=${page}">${page}
                    <span class="sr-only">(current)</span>
                </a>
            </li>
            <#if (page<totalPage)>
                <li class="page-item">
                    <a class="page-link" href="${urlPrefix}&page=${page+1}">${page+1}</a>
                </li>
            </#if>
            <#if (page>=totalPage)>
                <li class="page-item disabled">
                    <a class="page-link" href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                        <span class="sr-only">Next</span>
                    </a>
                </li>
            <#else>
                <li class="page-item">
                    <a class="page-link" href="${urlPrefix}&page=${page+1}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                        <span class="sr-only">Next</span>
                    </a>
                </li>
            </#if>
        </ul>
    </nav>
</#macro>


