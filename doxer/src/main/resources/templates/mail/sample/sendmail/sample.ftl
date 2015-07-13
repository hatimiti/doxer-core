<#-- サンプルメールテンプレート -->
おはよう、メール送信テスト
ここは改行
${data.name}

<#-- null値が想定される場合は変数名!でアクセス -->
${data.nullval!}

<#-- 変数がundefinedのときに表示する値を指定「変数名!デフォルト値」-->
${var!'これはデフォルト値'}

<#-- if サンプル -->
<#if data.age lt 11>
if-lt
</#if>
<#if data.age gt 9>
if-gt
</#if>
<#if data.age lte 10>
if-lte
</#if>
<#if data.age gte 10>
if-gte
</#if>

<#-- 繰り返しサンプル(配列、リスト)、_index でインデックス番号表示 -->
<#list data.nestedModels as n>
${n_index}: ${n.value}

</#list>

<#-- 配列、リストの特定の要素を取得(添え字は 0 始まり) -->
${data.nestedModels[2].value}

<#-- ?sizeで配列の数を表示 -->
${data.nestedModels?size}

<#-- タブや半角スペースをトリム -->
<#compress>
    xxxx
  yyyy
	zz　
</#compress>

<#-- インクルード -->
<#include "/common/footer.ftl">
