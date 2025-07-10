{{- printf "[h1]%s[/h1]\n" .Title -}}
{{- partial "html-to-bbcode" (dict "content" .Content) -}}
