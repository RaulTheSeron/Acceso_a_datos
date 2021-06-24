for $b in doc("Bailes")//baile
let $profesor := concat(data($b/profesor),": ")
return concat($profesor,(data($b/nombre)))
