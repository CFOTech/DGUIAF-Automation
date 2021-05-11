<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Nueva Agencia    (function ()         (_be7304</name>
   <tag></tag>
   <elementGuidId>25a4392f-b500-4e4a-8bfa-d8d2142c8083</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#_base</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='_base']</value>
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
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>_base</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                        


Nueva Agencia




    $(function () {
        $(&quot;#btnSave&quot;).click(btnSave_OnClick);
        $(&quot;#btnBack&quot;).click(btnBack_OnClick);

        ABMEdit_IsFormValid();
    });

    function btnSave_OnClick(onsuccess, onerror) {
        ClearMessages();

        if (!ABMEdit_IsFormValid(undefined, 'btnSave_OnClick')) {
//            alert('uno o mas campos no se ingresaron correctamente');
            return false;
        }

        var entity = ABMEdit_GetEntity ? ABMEdit_GetEntity() : &quot;null&quot;;

        if (entity == &quot;null&quot;)
            return;

        var data = &quot;{ esNuevo:true, entity:&quot; + entity + &quot; }&quot;;
        $.ajax({
            url: &quot;/ABMEdit/Agencia_Save&quot;,
            type: &quot;POST&quot;,
            data: data,
            dataType: &quot;json&quot;,
            contentType: &quot;application/json; charset=utf-8&quot;,
            success: function (data) {
                if (data.Success) {
                    if (typeof onSaveSuccess == 'function')
                        if (onSaveSuccess(data) != undefined)
                            return;

                    if (typeof onsuccess == 'function')
                        if (onsuccess(data))
                            return false;

                    Alert(&quot;Grabado Exitoso.&quot;, undefined, function () { Close(data.Data != undefined ? data.Data.Id : data.Id); });
                } else {
                    if (typeof onerror == 'function')
                        if (onerror(data))
                            return false;

                    for (var i = 0; i &lt; data.Messages.length; i++) {
                        if (data.Messages[i].EsError)
                            ShowError(data.Messages[i].Text);
                        else
                            ShowMessage(data.Messages[i].Text);
                    }
                }
            },
            error: function (e) {
                if (typeof onerror == 'function')
                    if (onerror(data))
                        return false;

                ShowError((typeof e.responseText != 'undefined') ? e.responseText : e);
            }
        });
    }

    function btnBack_OnClick() {
        Close(null);
    }

    function Close(id) {
        if (typeof Override_Close == 'function') {
            if (Override_Close(id))
                return false;
        }

            ABMEdit_Redirect(id);
    }



    

    function ABMEdit_GetEntity() {
        return $.toJSON({
            Id: $(&quot;#Id&quot;).val(),
            Codigo: $(&quot;#Codigo&quot;).val(),
            Nombre: $(&quot;#Nombre&quot;).val(),
            Abrev: $(&quot;#Abrev&quot;).val(),
            UsaWFTarifaria: $(&quot;#UsaWFTarifaria&quot;).is(':checked'),
            CodigoBCBA: $(&quot;#CodigoBCBA&quot;).val(),
            GeneraQR: $(&quot;#GeneraQR&quot;).is(':checked'),
            Cuenta_Unica: $(&quot;#Cuenta_Unica&quot;).is(':checked'),
            RequiereNotificacion: $(&quot;#RequiereNotificacion&quot;).is(':checked'),
            UrlNotificacion: $(&quot;#UrlNotificacion&quot;).val(),
            UserUrlNotificacion: $(&quot;#UserUrlNotificacion&quot;).val(),
            PassUrlNotificacion: $(&quot;#PassUrlNotificacion&quot;).val()
        });
    }

    function ABMEdit_Redirect(object) {
        $.blockUI();
        window.location = '/ver/Agencia';
    }


    function ABMEdit_IsFormValid(obj) {
        var result = true;
        if (obj == undefined || obj == null) {
            // Revisar todo
            if (!ABMEdit_IsFormValid($(&quot;#Codigo&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#Nombre&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#Abrev&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#UsaWFTarifaria&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#CodigoBCBA&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#GeneraQR&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#Cuenta_Unica&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#RequiereNotificacion&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#UrlNotificacion&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#UserUrlNotificacion&quot;))) result = false;
            if (!ABMEdit_IsFormValid($(&quot;#PassUrlNotificacion&quot;))) result = false;
        } else {
            var value = obj.val();
            var img = $(&quot;#&quot; + obj[0].id + &quot;_Validator&quot;);
            var messages = ValidateField(obj);  //Validaciones básicas

            // aquí van las validaciones especificas
            if (obj[0].id == &quot;CodigoBCBA&quot;) {  
                var reg = new RegExp('^[0-9]{6}$');
                var valCodigoBCBA = $(&quot;#CodigoBCBA&quot;).val();
                if (valCodigoBCBA != &quot;&quot;)
                    if (!reg.test(valCodigoBCBA))
                        messages[messages.length] = &quot;Error: El código BCBA ingresado no es válido&quot;;
            }


            //Muestro mensajes de error
            ClearMessages();
            for (var i = 0; i &lt; messages.length; i++)
                ShowError(messages[i]);
            ValidateFieldSetToImg(messages, img);

            return (messages.length == 0);
        }

        return result;
    }

        $(document).ready(function () {
            if ($(&quot;#CodigoBCBA&quot;).val().length == 6)
                    $(&quot;#GeneraQR&quot;).removeAttr(&quot;disabled&quot;);
            
            $(&quot;#CodigoBCBA&quot;).keyup(function () {
                if ($(this).val().length == 0)
                    $(&quot;#GeneraQR&quot;).attr(&quot;checked&quot;, false);
                if ($(this).val().length == 6)
                    $(&quot;#GeneraQR&quot;).removeAttr(&quot;disabled&quot;);
                if ($(this).val().length &lt; 6) {
                    $(&quot;#GeneraQR&quot;).attr(&quot;disabled&quot;, true);
                }
            }); 

            $(&quot;#Codigo&quot;).keyup(function () {
                if ($(&quot;#Codigo&quot;).val().length >= 3) {
                    $(&quot;#Cuenta_Unica&quot;).attr(&quot;checked&quot;, true);
                    $(&quot;#Cuenta_Unica&quot;).attr(&quot;disabled&quot;, true);
                }
                if ($(&quot;#Codigo&quot;).val().length &lt; 3) {
                    $(&quot;#Cuenta_Unica&quot;).attr(&quot;checked&quot;, false);
                    $(&quot;#Cuenta_Unica&quot;).attr(&quot;disabled&quot;, false);
                }
            });            
        });


 



    $(function () {
        $(&quot;#ABMEditar_Campos input&quot;).change(function () { ABMEdit_IsFormValid($(this)); });
        
    });




    
        
            

            
                Código:
                
                    Enter valueIncrementDecrement
                    
                
            

            
                Nombre:
                
                    
                    
                
            

            
                Abrev:
                
                    
                    
                
            

            
                Usa WF de Tarifaria:
                
                    
                    
                
            


            
                Requiere Notificación:
                
                    
                    
                
            

            
                Url Notificación:
                
                    
                    
                
            

            
                User Notificación:
                
                    
                    
                
            


            
                Password Notificación:
                
                    
                    
                
            

            
                Código BCBA:
                
                    Enter valueIncrementDecrement
                    
                    Impuesto+Extensión (000+000)
                    Ej: 910010
                
            

            
                Genera QR:
                
                    
                    
                
            

            
                Cuenta Única:
                
                    
                    
                
            
        
    




Crear
Volver




                    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;_base&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='_base']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Movimiento de Impresores'])[1]/following::div[9]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Auditoría de Impresores'])[1]/following::div[9]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div/div/div/div</value>
   </webElementXpaths>
</WebElementEntity>
