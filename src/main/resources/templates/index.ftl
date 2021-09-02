<#include "layout/base.ftl">
<#macro content>
    <!--Section: Cards-->
    <section class="pt-5">
        <script src="https://cdn.staticfile.org/clipboard.js/2.0.6/clipboard.js"></script>
        <!-- Heading & Description -->
        <div class="wow fadeIn">
            <h2 class="h1 text-center mb-1">Convert MQL4 to MQL5</h2>
            <p class="text-center">please add <a href="/file/MQL4TO5.mqh">MQL4TO5.mqh</a> and <a
                        href="/file/MT4Orders.mqh">MT4Orders.mqh</a> to MQL5/Include DIR first</p>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex justify-content-start">
                            <div class="form-row align-items-center" style="margin-bottom: 0.5rem;">
                                <div class="col-auto">
                                    <label class="sr-only" for="inlineFormInput">SourceType</label>
                                    <select class="form-control form-control-sm mdb-select" id="sourceType">
                                        <option>indicator</option>
                                        <option>script</option>
                                        <option>expert</option>
                                        <option>header</option>
                                    </select>
                                </div>
                                <div class="col-auto">
                                    <button onclick="covert()" id="convert" class="btn-copy-code btn btn-outline-grey btn-sm px-2 waves-effect">Convert
                                    </button>
                                </div>
                                <div class="col-auto">
                                    <button id="copy" data-clipboard-target="#mql5Code" class="btn-copy-code btn btn-outline-grey btn-sm px-2 waves-effect"><i class="fa fa-copy mr-1"></i> Copy MQL5 code
                                    </button>
                                </div>

                            </div>
                        </div>
                        <div>
                            <div style="width:100%;" class="form-group shadow-textarea d-flex justify-content-between">
                                 <textarea style="width:49%;height:500px;" id="mql4Code" class="form-control rounded-0">
                                 </textarea>
                                <textarea style="width:49%;height: 500px;" id="mql5Code" class="form-control">
                                 </textarea>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </section>
    <script>
        new ClipboardJS('#copy');
        function covert(){
            let code=$("#mql4Code").val();
            let sourceType=$("#sourceType").val();
            $.post( "/mql4to5", { type: sourceType, code: code })
                .done(function( data ) {
                   $("#mql5Code").val(data);
                });
        }
    </script>
    <!--Section: Cards-->
</#macro>
<@display_page title="MQL4TO5" keywords="auto convert mql4 to mql5 free" description="auto convert mql4 to mql5 free" nav="home"  />
