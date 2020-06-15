
Sub G3マトリクス整形_編集()
'
' 画面チーム用マクロ
'
    Application.ScreenUpdating = False
    
    
    Range("C:E,H:H,M:BC").Delete Shift:=xlToLeft
    
    
    
    Range("A:H").Columns.AutoFit
    Cells.Rows.AutoFit
    
    maxRowC = Cells(Rows.Count, 3).End(xlUp).Row ' C列の最下行番号
    maxRowF = Cells(Rows.Count, 6).End(xlUp).Row ' F列の最下行番号
    maxRowH = Cells(Rows.Count, 8).End(xlUp).Row ' H列の最下行番号
    
    Range(Cells(7, 3), Cells(maxRowC, 3)).Copy
    Range("B7").PasteSpecial Paste:=xlPasteFormats, Operation:=xlNone, _
        SkipBlanks:=False, Transpose:=False
    Range(Cells(7, 9), Cells(maxRowC, 11)).PasteSpecial Paste:=xlPasteFormats, Operation:=xlNone, _
        SkipBlanks:=False, Transpose:=False
        
    Range(Cells(7, 9), Cells(maxRowC, 11)).HorizontalAlignment = xlCenter
    Range(Cells(7, 9), Cells(maxRowC, 11)).VerticalAlignment = xlCenter
        
    ' 表示形式チェック対象外自動入力
    Dim i As Integer
    For i = 7 To maxRowF
        If Cells(i, 6) = "ー" Then
          Cells(i, 10).Value = "ー"
        End If
    Next
    
    ' 編集仕様チェック対象外自動入力
    For i = 7 To maxRowH
        If Cells(i, 8) = "ー" Then
          Cells(i, 11).Value = "ー"
        End If
    Next
        
        
    Application.CutCopyMode = False
    
    With Range(Cells(6, 2), Cells(maxRowC, 11)).Borders
        .LineStyle = xlContinuous
        .Weight = xlThin
    End With
    
    ActiveCell.Select
    Application.ScreenUpdating = True
End Sub


Sub G3マトリクス整形_要求_引継情報編集()
'
' 画面チーム用マクロ
'
    Application.ScreenUpdating = False
    Range("C:D,G:G,K:W").Delete Shift:=xlToLeft
    Range("A:I").Columns.AutoFit
    Cells.Rows.AutoFit
    
    maxRowC = Cells(Rows.Count, 3).End(xlUp).Row ' C列の最下行番号
    
    Range(Cells(7, 3), Cells(maxRowC, 3)).Copy
    Range("B7").PasteSpecial Paste:=xlPasteFormats, Operation:=xlNone, _
        SkipBlanks:=False, Transpose:=False
    Range(Cells(7, 8), Cells(maxRowC, 8)).PasteSpecial Paste:=xlPasteFormats, Operation:=xlNone, _
        SkipBlanks:=False, Transpose:=False
        
    Range(Cells(7, 8), Cells(maxRowC, 8)).HorizontalAlignment = xlCenter
    Range(Cells(7, 8), Cells(maxRowC, 8)).VerticalAlignment = xlCenter
        
    Application.CutCopyMode = False
    
    With Range(Cells(6, 2), Cells(maxRowC, 8)).Borders
        .LineStyle = xlContinuous
        .Weight = xlThin
    End With
    
    ActiveCell.Select
    Application.ScreenUpdating = True
End Sub

Sub G3マトリクス採番()
'
' 画面チーム用マクロ
'
    maxRowB = Cells(Rows.Count, 2).End(xlUp).Row ' B列の最下行番号
    maxRowC = Cells(Rows.Count, 3).End(xlUp).Row ' C列の最下行番号
    
    ' B7以下のセルをクリア
    If maxRowB >= 7 Then
      Range(Cells(7, 2), Cells(maxRowB, 2)).ClearContents
    End If

    If maxRowC < 7 Then
      Exit Sub
    End If
    
    ' C列に項目がない場合は終了
    Application.ScreenUpdating = False
    
    Cells(6, 2).Select
    Dim i As Integer: i = 0
    Do While ActiveCell.Address <> Cells(maxRowC, 3).Offset(1, -1).Offset(-1, 0).Address
      i = i + 1
      ActiveCell.Offset(1, 0).Select
      ActiveCell.Value = i
      ActiveCell.HorizontalAlignment = xlCenter
      ActiveCell.VerticalAlignment = xlCenter
    Loop
    
    Application.ScreenUpdating = True
End Sub
