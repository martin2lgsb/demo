//
//  ViewController.swift
//  VocalTextEdit
//
//  Created by Morgan Freeman on 2018/10/12.
//  Copyright © 2018 Morgan Freeman. All rights reserved.
//

import Cocoa

class ViewController: NSViewController {

    let speechSynthesizer = NSSpeechSynthesizer()
    
    @IBOutlet var textView: NSTextView!
    
    @IBAction func speakButtonClicked(_ sender: NSButton) {
//        print("I should speak \(textView.string)")
        let contents: String? = textView.string
        if contents != nil {
            speechSynthesizer.startSpeaking(contents!)
        } else {
            speechSynthesizer.startSpeaking("The document is empty.")
        }
    }
    
    @IBAction func stopButtonClicked(_ sender: NSButton) {
//        print("The stop button was clicked")
        speechSynthesizer.stopSpeaking()
    }
}

