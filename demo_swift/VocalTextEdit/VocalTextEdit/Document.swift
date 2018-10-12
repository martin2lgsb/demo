//
//  Document.swift
//  VocalTextEdit
//
//  Created by Morgan Freeman on 2018/10/12.
//  Copyright © 2018 Morgan Freeman. All rights reserved.
//

import Cocoa

class Document: NSDocument {

    enum Error: Swift.Error, LocalizedError {
        case UTF8Encoding
        
        var failureReason: String? {
            switch self {
            case .UTF8Encoding: return "File cannot be encoded in UTF-8."
            }
        }
    }
    
    override class var autosavesInPlace: Bool {
        return true
    }

    override func makeWindowControllers() {
        // Returns the Storyboard that contains your Document window.
        let storyboard = NSStoryboard(name: NSStoryboard.Name("Main"), bundle: nil)
        let windowController = storyboard.instantiateController(withIdentifier: NSStoryboard.SceneIdentifier("Document Window Controller")) as! NSWindowController
        self.addWindowController(windowController)
    }

    override func data(ofType typeName: String) throws -> Data {
        // Insert code here to write your document to data of the specified type, throwing an error in case of failure.
        // Alternatively, you could remove this method and override fileWrapper(ofType:), write(to:ofType:), or write(to:ofType:for:originalContentsURL:) instead.
        let windowController = windowControllers[0]
        let viewController = windowController.contentViewController as! ViewController
        let contents = viewController.textView.string
        
        guard let data = contents.data(using: .utf8) else {
            throw Document.Error.UTF8Encoding
        }
        
        return data
    }

    override func read(from data: Data, ofType typeName: String) throws {
        // Insert code here to read your document from the given data of the specified type, throwing an error in case of failure.
        // Alternatively, you could remove this method and override read(from:ofType:) instead.
        // If you do, you should also override isEntireFileLoaded to return false if the contents are lazily loaded.
        throw NSError(domain: NSOSStatusErrorDomain, code: unimpErr, userInfo: nil)
    }


}

