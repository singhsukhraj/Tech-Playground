package com.noobchain.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BasicBlock{
	private int previousHash;
    private String data;
    private int hash;
    public BasicBlock(String data, int previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        // Mix the content of this block with previous hash to create the hash of this new block
        // and that's what makes it block chain
        this.hash  = Arrays.hashCode(new Integer[]{data.hashCode(), previousHash});
    }
	public int getPreviousHash() {
		return previousHash;
	}
	public void setPreviousHash(int previousHash) {
		this.previousHash = previousHash;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getHash() {
		return hash;
	}
	public void setHash(int hash) {
		this.hash = hash;
	}
	
}


public class BasicBlockChain {

	public static void main(String[] args) {
        List<BasicBlock> blockChainList =  new ArrayList<>();
        BasicBlock genesis = new BasicBlock("BlockChain", 0);
        blockChainList.add(genesis);
        BasicBlock blockOne = new BasicBlock("Block1", blockChainList.get(blockChainList.size()-1).getHash());
        blockChainList.add(blockOne);
        BasicBlock blockTwo = new BasicBlock("Block2", blockChainList.get(blockChainList.size()-1).getHash());
        blockChainList.add(blockTwo);
        BasicBlock blockThree = new BasicBlock("Block3", blockChainList.get(blockChainList.size()-1).getHash());
        blockChainList.add(blockThree);
        System.out.println("---------------------");
        System.out.println("- BlockChain -");
        System.out.println("---------------------");
        blockChainList.forEach(System.out::println);
        System.out.println("---------------------");
        System.out.println("Is valid?: " + validate(blockChainList));
        System.out.println("---------------------");
        // corrupt block chain by modifying one of the block
        BasicBlock corruptBlock = new BasicBlock("corruptBlock", genesis.getHash());
        int index = blockChainList.indexOf(blockOne);
        blockChainList.remove(index);
        blockChainList.add(index, corruptBlock);
        System.out.println("Corrupted block chain by replacing 'Block1' block with 'corruptBlock' Block");
        System.out.println("---------------------");
        System.out.println("- BlockChain -");
        System.out.println("---------------------");
        blockChainList.forEach(System.out::println);
        System.out.println("---------------------");
        System.out.println("Is valid?: " + validate(blockChainList));
        System.out.println("---------------------");
    }
    private static boolean validate(List<BasicBlock> blockChain) {
        boolean result = true;
        BasicBlock lastBlock = null;
        for(int i = blockChain.size() -1; i >= 0; i--) {
            if(lastBlock == null) {
                lastBlock = blockChain.get(i);
            }
            else {
                BasicBlock current = blockChain.get(i);
                if(lastBlock.getPreviousHash() != current.getHash()) {
                    result = false;
                    break;
                }
                lastBlock = current;
            }
        }
        return result;
    }

}
