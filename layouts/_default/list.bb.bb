{{- printf "[h1]%s[/h1]\n" .Title -}}
{{- /* Create a custom sort key that uses directory name for _index files */ -}}
{{- $pages := .Pages -}}
{{- $sortedPages := slice -}}

{{- $pagesWithFiles := where .Pages ".File" "!=" nil -}}
{{- range $pagesWithFiles -}}
  {{- $sortKey := "" -}}
  {{- if eq .File.BaseFileName "_index" -}}
    {{- /* For _index files, use the parent directory name */ -}}
    {{- $sortKey = path.Base .File.Dir -}}
  {{- else -}}
    {{- /* For regular files, use the filename */ -}}
    {{- $sortKey = .File.BaseFileName -}}
  {{- end -}}
  
  {{- $sortedPages = $sortedPages | append (dict "page" . "sortKey" $sortKey) -}}
{{- end -}}

{{- /* Sort by the custom sort key */ -}}
{{- range sort $sortedPages "sortKey" }}
{{- printf "[h2]%s[/h2]\n" .page.Title -}}{{- partial "html-to-bbcode" (dict "content" .page.Content) -}}
{{- end }}
