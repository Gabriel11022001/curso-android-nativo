package com.app.app_componentes_listagem.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.app.app_componentes_listagem.Alimento;
import com.app.app_componentes_listagem.IOnClickItemListaListener;
import com.app.app_componentes_listagem.IOnRemoverListener;
import com.app.app_componentes_listagem.R;

import java.util.List;

public class AlimentoAdapter extends RecyclerView.Adapter<AlimentoAdapter.AlimentoViewHolder> {

    private Context contexto;
    private LayoutInflater layoutInflater;
    private List<Alimento> alimentos;
    private IOnClickItemListaListener iOnClickItemListaListener;
    private IOnRemoverListener iOnRemoverListener;

    public AlimentoAdapter(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public AlimentoAdapter() { }

    public AlimentoAdapter(
            List<Alimento> alimentos,
            IOnClickItemListaListener iOnClickItemListaListener,
            IOnRemoverListener iOnRemoverListener
    ) {
        this.alimentos = alimentos;
        this.iOnClickItemListaListener = iOnClickItemListaListener;
        this.iOnRemoverListener = iOnRemoverListener;
    }

    @NonNull
    @Override
    public AlimentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // método onde eu crio o viewholder
        contexto = parent.getContext();
        // posso criar um layoutinflater a partir do método from() da classe LayoutInflater
        layoutInflater = LayoutInflater.from(contexto);
        View view = layoutInflater.inflate(R.layout.alimento_adapter, parent, false);

        return new AlimentoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlimentoViewHolder holder, int position) {
        // método onde vou manipular os elementos de interface do elemento(item da lista)
        // o parâmetro position armazena o índice do elemento atual da lista
        Alimento alimento = this.alimentos.get(position);
        holder.txtAlimento.setText(alimento.nome);
        holder.txtCalorias.setText(String.valueOf(alimento.calorias));
        Log.i("id_alimento", String.valueOf(alimento.id));

        // configurando evento de clique sobre o item da recyclerview
        if (this.iOnClickItemListaListener != null) {
            Log.i("teste_clique", "clicou no elemento da lista!");
            holder.alimentoItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    iOnClickItemListaListener.click(alimento.nome);
                }
            });
        }

        // configurando o evento de remover o elemento da lista
        if (this.iOnRemoverListener != null) {
            Log.i("teste", "Clicou no botão para remover o elemento da lista!");
            holder.btnRemover.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    iOnRemoverListener.remover(holder.getAdapterPosition());
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        // método que retorna a quantidade de elementos que vão aparecer na lista

        return this.alimentos.size();
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    /**
     * Para armazenar e gerenciar a view(item da lista), eu preciso
     * definir um viewholder, para isso, eu posso criar uma classe interna
     * que herde da classe ViewHolder, e nessa classe viewholder que vou
     * mapear os elementos de interface
     */
    public class AlimentoViewHolder extends RecyclerView.ViewHolder {

        public TextView txtAlimento;
        public TextView txtCalorias;
        public ConstraintLayout alimentoItem;
        public Button btnRemover;

        public AlimentoViewHolder(@NonNull View itemView) {
            super(itemView);
            // mapeando os elementos de interface do item da lista
            txtAlimento = itemView.findViewById(R.id.txt_alimento);
            txtCalorias = itemView.findViewById(R.id.txt_calorias_alimento);
            alimentoItem = itemView.findViewById(R.id.alimento_item);
            btnRemover = itemView.findViewById(R.id.btn_remover);
        }
    }
}
