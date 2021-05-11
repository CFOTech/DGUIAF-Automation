<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Agencias     summary     Extiendo la fu_5b2452</name>
   <tag></tag>
   <elementGuidId>d223f6fb-a22d-4c80-9e4d-5f8fe3016e41</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Movimiento de Impresores'])[1]/following::div[7]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>row </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                
                    
                        


Agencias





    /// &lt;summary>
    /// Extiendo la funcion de redireccionar a otra página
    /// &lt;/summary>
    function Override_Redirect(url) {
Cab303f52e673438585d99c37fec02615_SaveParams();
        return false;   // dejo que continue la ejecución de la funcion original. Simil a: base.Redirect(url);
    }









    
        
        

                
                    

    ///TODO: ésto lo valida el mismo control
    // valido los combos cuando cambian 

    $(function() {

        // PRESS ENTER KEY
        $(&quot;#divGrid_Cab303f52e673438585d99c37fec02615_Filter input&quot;).keydown(function (e) {
            var keycode = (e.keyCode ? e.keyCode : (e.which ? e.which : e.charCode));
            if (keycode == 13) { Cab303f52e673438585d99c37fec02615_OnBuscar(); return false; } else { return true; }
        });

        // Seteo los Valores almacenados en el caché
if (localStorage['SIR.BO.Agencia.C7d19a031ed0446cea59f4c475fc66994'] !== undefined) { ClearFilter($('#C7d19a031ed0446cea59f4c475fc66994'), localStorage['SIR.BO.Agencia.C7d19a031ed0446cea59f4c475fc66994']); }if (localStorage['SIR.BO.Agencia.C1d436a13632f4bf0bc9fefb8bdd8b8a0'] !== undefined) { ClearFilter($('#C1d436a13632f4bf0bc9fefb8bdd8b8a0'), localStorage['SIR.BO.Agencia.C1d436a13632f4bf0bc9fefb8bdd8b8a0']); }
setTimeout(function() { Cab303f52e673438585d99c37fec02615_OnBuscar(); }, 100);    });

    function Cab303f52e673438585d99c37fec02615_OnLimpiar() {
ClearFilter($('#C7d19a031ed0446cea59f4c475fc66994'), undefined);localStorage.removeItem('SIR.BO.Agencia.C7d19a031ed0446cea59f4c475fc66994');ClearFilter($('#C1d436a13632f4bf0bc9fefb8bdd8b8a0'), undefined);localStorage.removeItem('SIR.BO.Agencia.C1d436a13632f4bf0bc9fefb8bdd8b8a0');
        Validate_Cab303f52e673438585d99c37fec02615_Params(false);
    }

    function Cab303f52e673438585d99c37fec02615_OnBuscar() {
        
        ClearMessages();
        var params = GetCab303f52e673438585d99c37fec02615_Params();
        if (params)
Cab303f52e673438585d99c37fec02615_RetriveData(1, params);
    }



    

    
    

        


    
        
        

                
                    
                    Codigo:
                
                
                            
            var C7d19a031ed0446cea59f4c475fc66994 = { type: 'NumericTextBox' };
            $(function() {
                $(&quot;#C7d19a031ed0446cea59f4c475fc66994&quot;).focus(function() { $(document).trigger(&quot;OnControlFocus&quot;, this); })
            });
        
filtrar por codigoIncrementDecrement



    $(function() {

        Validate_C7d19a031ed0446cea59f4c475fc66994();;

            
            $('#C7d19a031ed0446cea59f4c475fc66994').addClass('form-control');
            $('#C7d19a031ed0446cea59f4c475fc66994').removeClass('t-input');
            $('#C7d19a031ed0446cea59f4c475fc66994').attr('placeholder', 'filtrar por codigo');
            $('#C7d19a031ed0446cea59f4c475fc66994').css('width', '300px');
            $('#C7d19a031ed0446cea59f4c475fc66994').css('display', 'inline');

            $('#C7d19a031ed0446cea59f4c475fc66994').prev().addClass('form-control');
            $('#C7d19a031ed0446cea59f4c475fc66994').prev().css('color', '#999');
            $('#C7d19a031ed0446cea59f4c475fc66994').prev().css('font-style', 'normal');
            



if (false) { $('#C7d19a031ed0446cea59f4c475fc66994').hide(); }    });

    function C7d19a031ed0446cea59f4c475fc66994_OnChange() {
        // Override
        if (typeof Override_C7d19a031ed0446cea59f4c475fc66994_OnChange == &quot;function&quot;)
            if (Override_C7d19a031ed0446cea59f4c475fc66994_OnChange())
                return true;

        // Corrijo colores en el control (NumericTextBox)
            
            if ($('#C7d19a031ed0446cea59f4c475fc66994').val() > &quot;&quot;)
                $('#C7d19a031ed0446cea59f4c475fc66994').prev().css('color', '#000000');
            else
                $('#C7d19a031ed0446cea59f4c475fc66994').prev().css('color', '#9999');
            

        // Cascade
        $('#C7d19a031ed0446cea59f4c475fc66994').trigger('CascadeTo');

        Validate_C7d19a031ed0446cea59f4c475fc66994();
    }

    function Validate_C7d19a031ed0446cea59f4c475fc66994(showError) {
        SetWebControlValidator('C7d19a031ed0446cea59f4c475fc66994', false); // reseteo la señal de error

        // Override
        var valid = true;
        if (typeof Override_Validate_C7d19a031ed0446cea59f4c475fc66994 == &quot;function&quot;)
        {
            valid = Override_Validate_C7d19a031ed0446cea59f4c475fc66994(showError);
            if (valid != undefined) return valid;
        }
        valid = true;

        // Required

        // Validaciones para DatePicker

        return valid;
    }


                

                $(function () { if (false) { $('#WCContainer_C7d19a031ed0446cea59f4c475fc66994').hide(); } })

        
        
        
        

                
                    
                    Nombre:
                
                
                            
            var C1d436a13632f4bf0bc9fefb8bdd8b8a0 = { type: 'TextBox' };
            $(function() {
                $(&quot;#C1d436a13632f4bf0bc9fefb8bdd8b8a0&quot;).focus(function() { $(document).trigger(&quot;OnControlFocus&quot;, this); })
            });
        
        




    $(function() {

        Validate_C1d436a13632f4bf0bc9fefb8bdd8b8a0();;




if (false) { $('#C1d436a13632f4bf0bc9fefb8bdd8b8a0').hide(); }    });

    function C1d436a13632f4bf0bc9fefb8bdd8b8a0_OnChange() {
        // Override
        if (typeof Override_C1d436a13632f4bf0bc9fefb8bdd8b8a0_OnChange == &quot;function&quot;)
            if (Override_C1d436a13632f4bf0bc9fefb8bdd8b8a0_OnChange())
                return true;

        // Corrijo colores en el control (NumericTextBox)

        // Cascade
        $('#C1d436a13632f4bf0bc9fefb8bdd8b8a0').trigger('CascadeTo');

        Validate_C1d436a13632f4bf0bc9fefb8bdd8b8a0();
    }

    function Validate_C1d436a13632f4bf0bc9fefb8bdd8b8a0(showError) {
        SetWebControlValidator('C1d436a13632f4bf0bc9fefb8bdd8b8a0', false); // reseteo la señal de error

        // Override
        var valid = true;
        if (typeof Override_Validate_C1d436a13632f4bf0bc9fefb8bdd8b8a0 == &quot;function&quot;)
        {
            valid = Override_Validate_C1d436a13632f4bf0bc9fefb8bdd8b8a0(showError);
            if (valid != undefined) return valid;
        }
        valid = true;

        // Required

        // Validaciones para DatePicker

        return valid;
    }


                

                $(function () { if (false) { $('#WCContainer_C1d436a13632f4bf0bc9fefb8bdd8b8a0').hide(); } })

        
        



        
            


    $(function () {
        // Arreglo estilos visuales de los DropDownList
        $('#Cab303f52e673438585d99c37fec02615OrderByControl').prev().css('border-radius', '4px');
        $('#Cab303f52e673438585d99c37fec02615OrderByControl').prev().find('.t-icon').css('margin-top', '5px');

$('#divCab303f52e673438585d99c37fec02615OrderByControl').hide();
        var databind = [
{ Text: &quot;Codigo&quot;, Value: &quot;Key_b6db43c042fa4834a8010a7580923a70&quot; },            null];
        databind.pop();

        $(&quot;#Cab303f52e673438585d99c37fec02615OrderByControl&quot;).data('tDropDownList').dataBind(databind);

        if (databind.length > 0) { $('#Cab303f52e673438585d99c37fec02615OrderByControl').data('tDropDownList').select(0); };
    })




    
        Ordenamiento:
    
    
        Codigoselect
    


        

        
            
                Limpiar
                Buscar 
            
        
    

        
            
                        
            var C83715cf81fc3452d85b073e7f5955fd9 = { type: 'NewEntityButton' };
            $(function() {
                $(&quot;#C83715cf81fc3452d85b073e7f5955fd9&quot;).focus(function() { $(document).trigger(&quot;OnControlFocus&quot;, this); })
            });
        
Nuevofunction RandomScript_11c738c2938744e98e13ef9c1228d12e(id) { Redirect('/Home/ABMEditar/--8740fd2611584836bcfd3756a2803769--?element=Agencia&amp;esNuevo=true'.replace('--8740fd2611584836bcfd3756a2803769--', (typeof id == 'undefined') ? '' : id)); } 




    $(function() {

        Validate_C83715cf81fc3452d85b073e7f5955fd9();;




if (false) { $('#C83715cf81fc3452d85b073e7f5955fd9').hide(); }    });

    function C83715cf81fc3452d85b073e7f5955fd9_OnChange() {
        // Override
        if (typeof Override_C83715cf81fc3452d85b073e7f5955fd9_OnChange == &quot;function&quot;)
            if (Override_C83715cf81fc3452d85b073e7f5955fd9_OnChange())
                return true;

        // Corrijo colores en el control (NumericTextBox)

        // Cascade
        $('#C83715cf81fc3452d85b073e7f5955fd9').trigger('CascadeTo');

        Validate_C83715cf81fc3452d85b073e7f5955fd9();
    }

    function Validate_C83715cf81fc3452d85b073e7f5955fd9(showError) {
        SetWebControlValidator('C83715cf81fc3452d85b073e7f5955fd9', false); // reseteo la señal de error

        // Override
        var valid = true;
        if (typeof Override_Validate_C83715cf81fc3452d85b073e7f5955fd9 == &quot;function&quot;)
        {
            valid = Override_Validate_C83715cf81fc3452d85b073e7f5955fd9(showError);
            if (valid != undefined) return valid;
        }
        valid = true;

        // Required

        // Validaciones para DatePicker

        return valid;
    }



            
        

    

    $(function () {
    });



    
        


    


    






    $(function() {

        ;




if (false) { $('#C4e79df5442694d4599b80f884856e199').hide(); }    });

    function C4e79df5442694d4599b80f884856e199_OnChange() {
        // Override
        if (typeof Override_C4e79df5442694d4599b80f884856e199_OnChange == &quot;function&quot;)
            if (Override_C4e79df5442694d4599b80f884856e199_OnChange())
                return true;

        // Corrijo colores en el control (NumericTextBox)

        // Cascade
        $('#C4e79df5442694d4599b80f884856e199').trigger('CascadeTo');

        Validate_C4e79df5442694d4599b80f884856e199();
    }

    function Validate_C4e79df5442694d4599b80f884856e199(showError) {
        SetWebControlValidator('C4e79df5442694d4599b80f884856e199', false); // reseteo la señal de error

        // Override
        var valid = true;
        if (typeof Override_Validate_C4e79df5442694d4599b80f884856e199 == &quot;function&quot;)
        {
            valid = Override_Validate_C4e79df5442694d4599b80f884856e199(showError);
            if (valid != undefined) return valid;
        }
        valid = true;

        // Required

        // Validaciones para DatePicker

        return valid;
    }


    
    
        
            

ImprimirExportar a ExcelExportar a PDFCódigoNombreAbrevUsa WF de TarifariaCódigoBCBAGenera QREditar1Dir. Gral del Registro Civil y Capacidad de las PersonasD.G.Registro Civ.CtralSi910000SiEditar2Dir. Gral de CementeriosD.G.CementeriosSi910001SiEditar3Dir. Gral Administrativa de InfraccionesDGAISi910002SiEditar4Donaciones Ba TaxiDonaciones BA TaxiSiNoEditar5Dir. Gral de Fiscalización de Obras y CatastroD.G.Fisc Obras y CatastroSi910003SiEditar6Unidad Administrativa de FaltasUACFSi910004SiEditar7Dirección General de Educación Vial y LicenciasEducacion VialSi910005SiEditar8Dir. Gral de Compras y ContratacionesD.G.Compras y ContSi910006SiEditar9Dir. Gral de Mesa de Entradas Salidad y ArchivoMesa de EntradasSi910007SiEditar10Dir. Gral de Higiene y Seguridad AlimentariaD.G.Higiene y Seg AlSi910008SiEditar11Secretaría de Integración Social y UrbanaSISyUSi910057SiEditar12Dir. Gral de Planeamiento e Interpretación UrbanísticaD.G.PlanSi910009SiEditar|&lt;12345678>|Pág 1 de 9 - Total de 103 elementos


function RandomScript_d4ad460bd49b49db9c3ecc57cdda492f(id) { ClearMessages(); var url = '/editar/Agencia/--id--'.replace('--id--', id); Redirect(url); $.blockUI(); } 




    $(function () {
        $('#Cab303f52e673438585d99c37fec02615 .t-grid-pager').html('&lt;div class=&quot;t-pager t-reset&quot;>&lt;/div>&lt;div class=&quot;t-status-text&quot;>&lt;/div>');
        Validate_Cab303f52e673438585d99c37fec02615_Params(false);

        $('#Cab303f52e673438585d99c37fec02615').css('border-radius', '3px');

        // grilla
        $('#Cab303f52e673438585d99c37fec02615').find('table')
            .css('font-family', 'Arial') // ,MS Reference Sans Serif')
            .css('font-size', '12px');

        // header
        $('#Cab303f52e673438585d99c37fec02615').find('table thead').find('.t-header').css('background-color', '#BBBBBB');

        // header-span
        $('#Cab303f52e673438585d99c37fec02615').find('table thead').find('.t-header .t-link')
                .css('height', 'auto')
                .css('white-space', 'pre-wrap')
                .css('padding-right', '8px')
                .css('text-align', 'center');

        // footer
        $('#Cab303f52e673438585d99c37fec02615').find('table tfoot tr td').css('background-color', '#DDDDDD');
    });

    function Cab303f52e673438585d99c37fec02615_OnComplete(sender) {
        if (typeof Override_Cab303f52e673438585d99c37fec02615_OnComplete == &quot;function&quot;)
        Override_Cab303f52e673438585d99c37fec02615_OnComplete(sender);
    }

    function Cab303f52e673438585d99c37fec02615_OnRowDataBound(sender) {
        if (typeof Override_Cab303f52e673438585d99c37fec02615_OnRowDataBound == &quot;function&quot;)
        Override_Cab303f52e673438585d99c37fec02615_OnRowDataBound(sender);

        var data = sender.dataItem;

        // Color de fondo para los rows de las grillas
        if (data.__BackColor != undefined)
            $(sender.row).css('background-color', data.__BackColor == null ? 'transparent' : data.__BackColor);

        // HideIf Section

        // ChangeTextIf Section
    }

    function Cab303f52e673438585d99c37fec02615_OnRowSelected(e) {
        if (typeof Override_Cab303f52e673438585d99c37fec02615_OnRowSelected == &quot;function&quot;)
        Override_Cab303f52e673438585d99c37fec02615_OnRowSelected(e);

        var row = $('#Cab303f52e673438585d99c37fec02615').data('tGrid').data[e.row.rowIndex - 1];
        var id = row.Id;


    }

    /// &lt;summary>
    /// Devuelve los parámetros tal como están en los filtros. null en caso de error de validación.
    /// &lt;/summary>
    function GetCab303f52e673438585d99c37fec02615_Params() {
        if (!Validate_Cab303f52e673438585d99c37fec02615_Params()) return null;

        var result = [
GetListadoFilterFromNumericTextBox($('#C7d19a031ed0446cea59f4c475fc66994'), 'codigo', 'Codigo'),
GetListadoFilterFromTextBox($('#C1d436a13632f4bf0bc9fefb8bdd8b8a0'), 'nombre', 'Nombre'),
        null];
        result.pop();   // elimina el último elemento
        return result;
    }


    /// &lt;summary>
    /// Valida los WebControls utilizados como filtros/parámetros para la grilla
    /// &lt;/summary>
    function Validate_Cab303f52e673438585d99c37fec02615_Params(showMessageIfError, wcName) {
        showMessageIfError = showMessageIfError === undefined ? true : showMessageIfError;
        var requiredError = false;


        if (requiredError &amp;&amp; showMessageIfError) {
            ShowError(&quot;Se ha encontrado al menos un campo con error&quot;);
            return false;
        }

        return true;
    }

    /// &lt;summary>
    /// Guarda el estado de los filtros en el Cache
    /// &lt;/summary>
    function Cab303f52e673438585d99c37fec02615_SaveParams() {
var sp_fcffed4a51c049e39c21ec0c571f8fd9 = GetListadoFilterFromNumericTextBox($('#C7d19a031ed0446cea59f4c475fc66994')).value; if(sp_fcffed4a51c049e39c21ec0c571f8fd9) { localStorage['SIR.BO.Agencia.C7d19a031ed0446cea59f4c475fc66994'] = sp_fcffed4a51c049e39c21ec0c571f8fd9; } else { localStorage.removeItem('SIR.BO.Agencia.C7d19a031ed0446cea59f4c475fc66994'); }var sp_1671951141fc40f4843780af0c971348 = GetListadoFilterFromTextBox($('#C1d436a13632f4bf0bc9fefb8bdd8b8a0')).value; if(sp_1671951141fc40f4843780af0c971348) { localStorage['SIR.BO.Agencia.C1d436a13632f4bf0bc9fefb8bdd8b8a0'] = sp_1671951141fc40f4843780af0c971348; } else { localStorage.removeItem('SIR.BO.Agencia.C1d436a13632f4bf0bc9fefb8bdd8b8a0'); }    }





    var Cab303f52e673438585d99c37fec02615_PARAMS = null;
    var Cab303f52e673438585d99c37fec02615_PAGENUM = 1;


    function Cab303f52e673438585d99c37fec02615_Refresh(onsuccess) {
        var ps = GetCab303f52e673438585d99c37fec02615_Params();
        if (ps == null) { return null; }
Cab303f52e673438585d99c37fec02615_RetriveData(1, ps, onsuccess);
    }

    /// &lt;summary>
    /// Obtiene los datos para llenar la grilla
    /// &lt;/summary>
    function Cab303f52e673438585d99c37fec02615_RetriveData(pageNum, params, onsuccess) {
        // Administración de parámetros
        if (pageNum)
Cab303f52e673438585d99c37fec02615_PAGENUM = pageNum;
        else
            pageNum = Cab303f52e673438585d99c37fec02615_PAGENUM;

        if (params)
Cab303f52e673438585d99c37fec02615_PARAMS = params;
        else
            params = Cab303f52e673438585d99c37fec02615_PARAMS;

        // Override
        if (typeof Override_Cab303f52e673438585d99c37fec02615_RetriveData == &quot;function&quot;) if (Override_Cab303f52e673438585d99c37fec02615_RetriveData(pageNum, params)) return false;

var data = $.toJSON({ service: 'Cobranza', method: 'GetAgencias', filters: params, pager: Cab303f52e673438585d99c37fec02615_GetPager(pageNum) });CallAjax('/ABMListado/GetGridData', data, function(data, fulldata) { if(onsuccess) onsuccess(data, fulldata); Cab303f52e673438585d99c37fec02615_SetDataOnGrid(fulldata) });    }


    function Cab303f52e673438585d99c37fec02615_Clear() {
        var data = {
            Data: [],
            TotalCount: 0,
            PageNum: 1,
            PageSize: 1
        };
Cab303f52e673438585d99c37fec02615_SetDataOnGrid(data);
    }

    /// &lt;summary>
    /// Establece los datos en la grilla
    /// &lt;/summary>
    function Cab303f52e673438585d99c37fec02615_SetDataOnGrid(data) {
        // -- Llamo al evento Before --
        if (typeof Cab303f52e673438585d99c37fec02615_OnBeforeSetDataOnGrid == 'function' &amp;&amp; !Cab303f52e673438585d99c37fec02615_OnBeforeSetDataOnGrid(data)) return false;

        // -- Seteo los datos en la grilla --
        $(&quot;#Cab303f52e673438585d99c37fec02615&quot;).data('tGrid').dataBind(data.Data);
        $(&quot;#Cab303f52e673438585d99c37fec02615&quot;)[0].ActualTotalCount = data.TotalCount;

        // -- Genero el Footer --
        var toLeft = 3;
        var toRigth = 7;
        var min = data.PageNum - toLeft &lt; 1 ? 1 : data.PageNum - toLeft;
        var realmax = parseInt(data.TotalCount / data.PageSize) + ((data.TotalCount / data.PageSize != parseInt(data.TotalCount / data.PageSize)) ? 1 : 0);
        if (realmax > data.PageNum + toRigth) max = data.PageNum + toRigth; else max = realmax;

        var html = '&lt;div class=&quot;t-numeric&quot;>';

        // inicio
        if (min &lt; data.PageNum) {
            html += '&lt;a class=&quot;t-link t-pager-btn&quot; page=&quot;1&quot;>|&amp;lt;&lt;/a>';
        } else {
            html += '&lt;span class=&quot;t-state-active&quot; page=&quot;1&quot;>|&amp;lt;&lt;/span>'
        }

        // numeros
        for(var i = min; i &lt;= max; i++){
            if (i == data.PageNum) {
                html += '&lt;span class=&quot;t-state-active&quot; page=&quot;' + i + '&quot;>' + i + '&lt;/span>'
            } else {
                html += '&lt;a class=&quot;t-link t-pager-btn&quot; page=&quot;' + i + '&quot;>' + i + '&lt;/a>';
            }
        }

        // fin
        if (max > data.PageNum) {
            html += '&lt;a class=&quot;t-link t-pager-btn&quot; page=&quot;' + realmax + '&quot;>&amp;gt;|&lt;/a>';
        } else {
            html += '&lt;span class=&quot;t-state-active&quot; page=&quot;' + realmax + '&quot;>&amp;gt;|&lt;/span>'
        }
        $(&quot;#Cab303f52e673438585d99c37fec02615 .t-grid-pager .t-pager&quot;).html(html + '&lt;/div>');


        // agrego el evento click
        $(&quot;#Cab303f52e673438585d99c37fec02615 .t-grid-pager .t-pager .t-pager-btn&quot;)
            .click(function (e) { Cab303f52e673438585d99c37fec02615_RetriveData(parseInt($(e.currentTarget).attr(&quot;page&quot;)), undefined) })
            .hover(function(){ $(this).addClass('t-state-hover') },
                   function(){ $(this).removeClass('t-state-hover') });
        var statusFormat =  'Pág {pag.PageNum} de {realmax} - Total de {data.TotalCount} elementos';

        if (data.ExecTimeToShow != undefined &amp;&amp; data.ExecTimeToShow != null)
        {
            statusFormat = '&lt;div style=&quot;float: left;&quot;>' + statusFormat + '&lt;/div>' +
                           '&lt;div style=&quot;margin-top: 4px; float: right;&quot;>&lt;span class=&quot;ui-icon ui-icon-clock&quot; />&lt;/div>' +
                           '&lt;div style=&quot;margin-left: 15px; float: right;&quot;>{data.ExecTimeToShow}&lt;/div>';
        }

        realmax = isNaN(realmax) ? data.TotalCount : realmax;

        var text = statusFormat.replace(&quot;{pag.PageNum}&quot;, data.PageNum)
                               .replace(&quot;{realmax}&quot;, realmax)
                               .replace(&quot;{data.TotalCount}&quot;, data.TotalCount)
                               .replace(&quot;{data.ExecTimeToShow}&quot;, data.ExecTimeToShow);

        $(&quot;#Cab303f52e673438585d99c37fec02615 .t-grid-pager .t-status-text&quot;).html(text);

        // TOTAL FOOTER

        // -- Llamo al evento After --
        if (typeof Cab303f52e673438585d99c37fec02615_OnAfterSetDataOnGrid == 'function' &amp;&amp; !Cab303f52e673438585d99c37fec02615_OnAfterSetDataOnGrid(data)) return false;

        
    }

    /// &lt;summary>
    /// Obtiene los datos de la grilla
    /// &lt;/summary>
    function Cab303f52e673438585d99c37fec02615_GetInfo() {
        return {
            params: Cab303f52e673438585d99c37fec02615_PARAMS,
            pageNum: Cab303f52e673438585d99c37fec02615_PAGENUM,
            pageSize: 12
            };
    }


    /// &lt;summary>
    /// Devuelve el estado actual del Pager de la grilla
    /// &lt;/summary>
    function Cab303f52e673438585d99c37fec02615_GetPager(pageNum) {
        var orders = [];
        // Orders
orders['Key_b6db43c042fa4834a8010a7580923a70'] = 'Codigo ASC';
        return {
            PageNum: pageNum ? pageNum : Cab303f52e673438585d99c37fec02615_GetInfo().pageNum,
            PageSize: 12,
            OrderByCode: orders[$(&quot;#Cab303f52e673438585d99c37fec02615OrderByControl&quot;).val()],

            paginate: function(array) {
                // Ordenar? (No sé si es necesario ordenar, además el formato de ordenamiento debería ser adaptable a JavaScript).

                // Recortar el Array
                var data = GetSubArray(array, ((this.PageNum - 1) * this.PageSize), this.PageSize);

                return {
                    Data: data,
                    PageNum: this.PageNum,
                    PageSize: this.PageSize,
                    TotalCount: array.length
                };
            }
        };
    }

    /// &lt;summary>
    /// Devuelve el datarow según su índice único
    /// &lt;/summary>
    function Cab303f52e673438585d99c37fec02615_GetRowById(id)
    {
        return GetItemFromArray($('#Cab303f52e673438585d99c37fec02615').data('tGrid').data, function (i) { return i.Id == id });
    }




    
    /// &lt;summary>
    /// Ocurre. Al presionar &quot;Imprimir&quot; en la botonera de la grilla
    /// &lt;/summary>
    function Cab303f52e673438585d99c37fec02615_OnPrint(currentPage) {
        ClearMessages();
        var filters = GetCab303f52e673438585d99c37fec02615_Params();
        if (filters == null)
            return;
        
        var pager = Cab303f52e673438585d99c37fec02615_GetPager();
        if (!currentPage)
            pager.PageSize = 0;

        var fulldata = null;

        CallPrintGrid(&quot;#document[0]/Configuration[0]/ABMListado[0]/Group[0]/Entity[9]/Grid[0]&quot;, &quot;Cab303f52e673438585d99c37fec02615&quot;, filters, pager, fulldata);
    }

    /// &lt;summary>
    /// Ocurre. Al presionar &quot;Exportar&quot; (Excel o PDF) en la botonera de la grilla
    /// &lt;/summary>
    function Cab303f52e673438585d99c37fec02615_OnExport(output, currentPage) {
        ClearMessages();
        var filters = GetCab303f52e673438585d99c37fec02615_Params();
        if (filters == null)
            return;
        
        var pager = Cab303f52e673438585d99c37fec02615_GetPager();
        if (!currentPage)
            pager.PageSize = 0;

        var fulldata = null;
        
        CallExport(&quot;#document[0]/Configuration[0]/ABMListado[0]/Group[0]/Entity[9]/Grid[0]&quot;, output, &quot;Cab303f52e673438585d99c37fec02615&quot;, filters, pager, fulldata);
    }



        
    

    

    $(function () {
    });



    
        


    


    






    $(function() {

        ;




if (false) { $('#C4d7a2b94ac374fd0a9b87a6d891af16f').hide(); }    });

    function C4d7a2b94ac374fd0a9b87a6d891af16f_OnChange() {
        // Override
        if (typeof Override_C4d7a2b94ac374fd0a9b87a6d891af16f_OnChange == &quot;function&quot;)
            if (Override_C4d7a2b94ac374fd0a9b87a6d891af16f_OnChange())
                return true;

        // Corrijo colores en el control (NumericTextBox)

        // Cascade
        $('#C4d7a2b94ac374fd0a9b87a6d891af16f').trigger('CascadeTo');

        Validate_C4d7a2b94ac374fd0a9b87a6d891af16f();
    }

    function Validate_C4d7a2b94ac374fd0a9b87a6d891af16f(showError) {
        SetWebControlValidator('C4d7a2b94ac374fd0a9b87a6d891af16f', false); // reseteo la señal de error

        // Override
        var valid = true;
        if (typeof Override_Validate_C4d7a2b94ac374fd0a9b87a6d891af16f == &quot;function&quot;)
        {
            valid = Override_Validate_C4d7a2b94ac374fd0a9b87a6d891af16f(showError);
            if (valid != undefined) return valid;
        }
        valid = true;

        // Required

        // Validaciones para DatePicker

        return valid;
    }



    




    $(function() {

        ;




if (false) { $('#Cab303f52e673438585d99c37fec02615').hide(); }    });

    function Cab303f52e673438585d99c37fec02615_OnChange() {
        // Override
        if (typeof Override_Cab303f52e673438585d99c37fec02615_OnChange == &quot;function&quot;)
            if (Override_Cab303f52e673438585d99c37fec02615_OnChange())
                return true;

        // Corrijo colores en el control (NumericTextBox)

        // Cascade
        $('#Cab303f52e673438585d99c37fec02615').trigger('CascadeTo');

        Validate_Cab303f52e673438585d99c37fec02615();
    }

    function Validate_Cab303f52e673438585d99c37fec02615(showError) {
        SetWebControlValidator('Cab303f52e673438585d99c37fec02615', false); // reseteo la señal de error

        // Override
        var valid = true;
        if (typeof Override_Validate_Cab303f52e673438585d99c37fec02615 == &quot;function&quot;)
        {
            valid = Override_Validate_Cab303f52e673438585d99c37fec02615(showError);
            if (valid != undefined) return valid;
        }
        valid = true;

        // Required

        // Validaciones para DatePicker

        return valid;
    }


                

                $(function () { if (false) { $('#WCContainer_Cab303f52e673438585d99c37fec02615').hide(); } })

        
        









                    
                
            </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;fullWidth&quot;]/div[@class=&quot;container-fluid&quot;]/div[@class=&quot;row&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Movimiento de Impresores'])[1]/following::div[7]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Auditoría de Impresores'])[1]/following::div[7]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
