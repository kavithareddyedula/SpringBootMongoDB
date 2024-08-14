#MongoDB installation on mac m2 

#make sure your homebrew is upto date with latest Xcode command-line

Homebrew requires the Xcode command-line tools from Apple's Xcode.



1.Install mongoldb :  brew install mongodb-community@7.0

2.Install mongoldb shell : brew install mongodb-community-shell

3.Start mongoldb :   brew services start mongodb/brew/mongodb-community

4.brew list mongodb-community@7.0

		/opt/homebrew/Cellar/mongodb-community/7.0.12/bin/install_compass
		/opt/homebrew/Cellar/mongodb-community/7.0.12/bin/mongod
		/opt/homebrew/Cellar/mongodb-community/7.0.12/bin/mongos
		/opt/homebrew/Cellar/mongodb-community/7.0.12/homebrew.mxcl.mongodb-community.plist
		/opt/homebrew/Cellar/mongodb-community/7.0.12/macos_mongodb.plist
		/opt/homebrew/Cellar/mongodb-community/7.0.12/MPL-2
		/opt/homebrew/Cellar/mongodb-community/7.0.12/sbom.spdx.json
		/opt/homebrew/Cellar/mongodb-community/7.0.12/sbom_from_silk.json
		/opt/homebrew/Cellar/mongodb-community/7.0.12/THIRD-PARTY-NOTICES


5.Copy the bin path of your —> /opt/homebrew/Cellar/mongodb-community/7.0.12/bin

6.Open up your .zshrc file with any text-editor
   
    kavithareddy@kavithas-MBP ~ % vi .zshrc

7.Add this line to the file:
		export PATH="/opt/homebrew/Cellar/mongodb-community/7.0.12/bin:${PATH}"

8.Run this —> to pick up the changes —>. source ~/.zshrc

9.Run the mongo command 

	kavithareddy@kavithas-MBP ~ % mongo
	MongoDB shell version v5.0.28
	connecting to: mongodb://127.0.0.1:27017/?  compressors=disabled&gssapiServiceName=mongodb
	Implicit session: session { "id" : UUID("82972e2d-11dc-460d-a5e0-5b2cd14bdb6c") }
	MongoDB server version: 7.0.12
	WARNING: shell and server versions do not match
