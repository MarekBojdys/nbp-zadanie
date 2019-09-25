
			function registerEvents() {
			    var goldButton = document.getElementById("gold-button");
			    goldButton.onclick = function() {
			        getGold();
		   		 }
			    
			    var currencyButton = document.getElementById("currency-button");
			    currencyButton.onclick = function() {
			        getCurrency();
		   		 }
			}
			    
			  
		
			function getGold(){
				require(["dojo/_base/xhr", "dojo/dom","dojo/domReady!"],
					function(xhr, dom) { 
						xhr.get({
							url: "/clarite-nbp/gold",
							handleAs: "json",
							load: function(jsonData) {
								var content = "<table border>";
								content += "<tr><td>Cena</td><td>Data</td></tr>"
								content += "<tr><td>" + jsonData.cena + "</td>";
								content += "<td>" + jsonData.data + "</td></tr>";
								
								content += "</table>";
								dom.byId("contentNode").innerHTML = content;
							},
								error: function() {
									
							}
						}); 
					});
				}
				
				function getCurrency(){
				require(["dojo/_base/xhr", "dojo/dom", "dojo/_base/array","dojo/domReady!"],
						function(xhr, dom, arrayUtil) { 
							xhr.get({
								url: "/clarite-nbp/currency",
								handleAs: "json",
								load: function(jsonData) {
									var content =  "<table border>";
									content += "<tr><td>Code</td><td>Mid</td><td>Currency</td></tr>"
									// For every news item we received...
									arrayUtil.forEach(jsonData, function(newsItem) {
									// Build data from the JSON
									content +=   "<tr><td>" + newsItem.code +  "</td>";
									content +=   "<td>" + newsItem.mid +  "</td>";
									content +=   "<td>" +newsItem.currency + "</td></tr>";
									});
									
									dom.byId("contentNode").innerHTML = content;
								},
									error: function() {
										
								}
							}); 
						});
				}
				
				getGold();
				registerEvents();
