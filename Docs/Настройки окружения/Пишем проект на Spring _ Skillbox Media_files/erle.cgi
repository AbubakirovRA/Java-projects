
(function (ph){
try{
var A = self['DSPCounter' || 'AdriverCounter'],
	a = A(ph);
a.reply = {
ph:ph,
rnd:'570805',
bt:62,
sid:222783,
pz:0,
sz:'%2f',
bn:0,
sliceid:0,
netid:0,
ntype:0,
tns:0,
pass:'',
adid:0,
bid:2864425,
geoid:85,
cgihref:'//ad.adriver.ru/cgi-bin/click.cgi?sid=222783&ad=0&bid=2864425&bt=62&bn=0&pz=0&xpid=DTAyqDcisVwB9H7E5KDMN8SljFelhiSh6zFPVy-yXc6snnE7HreaOhGmGwQnuojupW4M_Dmug&ref=https:%2f%2fskillbox.ru%2f&custom=206%3DDSPCounter',
target:'_blank',
width:'0',
height:'0',
alt:'AdRiver',
mirror:A.httplize('//masterh7.adriver.ru'), 
comp0:'0/script.js',
custom:{"206":"DSPCounter"},
cid:'',
uid:0,
xpid:'DTAyqDcisVwB9H7E5KDMN8SljFelhiSh6zFPVy-yXc6snnE7HreaOhGmGwQnuojupW4M_Dmug'
}
var r = a.reply;

r.comppath = r.mirror + '/images/0002864/0002864425/' + (/^0\//.test(r.comp0) ? '0/' : '');
r.comp0 = r.comp0.replace(/^0\//,'');
if (r.comp0 == "script.js" && r.adid){
	A.defaultMirror = r.mirror; 
	A.loadScript(r.comppath + r.comp0 + '?v' + ph) 
} else if ("function" === typeof (A.loadComplete)) {
   A.loadComplete(a.reply);
}
(function (o) {
	var i, w = o.c || window, d = document, y = 10;
	function oL(){
		if (!w.postMessage || !w.addEventListener) {return;}
		if (w.document.readyState == 'complete') {return sL();}
		w.addEventListener('load', sL, false);
	}
	function sL(){try{i.contentWindow.postMessage('pgLd', '*');}catch(e){}}
	function mI(u, oL){
		var i = d.createElement('iframe'); i.setAttribute('src', o.hl(u)); i.onload = oL; with(i.style){width = height = '10px'; position = 'absolute'; top = left = '-10000px'} d.body.appendChild(i);
		return i;
	}
	function st(u, oL){
		if (d.body){return i = mI(u, oL)}
		if(y--){setTimeout(function(){st(u, oL)}, 100)}
	}
	st(o.hl('https://content.adriver.ru/banners/0002186/0002186173/0/s.html?0&0&1&0&570805&0&0&85&178.208.251.123&counter&' + (o.all || 0)), oL);
}({
	hl: A.httplize,
	
	all: 1
	
}));
}catch(e){} 
}('0'));
